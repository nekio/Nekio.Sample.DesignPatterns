package nekio.sample.dp.behavioural.state;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.state.generic.IState;

public class AvailableState implements IState{
    private StateSwitcher stateSwitcher;
    
    public AvailableState(StateSwitcher stateSwitcher){
        System.out.println("< Turning Available State >");
        this.stateSwitcher = stateSwitcher;
    }
    
    @Override
    public void decrease(double value) {
        double originalAmount = stateSwitcher.getAmount();
        if(value > originalAmount){
            System.out.println("Insufficient fund (" + value + "). Dispense the available amount:" + originalAmount);
            value = originalAmount;
        }
        
        double currentAmount = stateSwitcher.getAmount() - value;
        stateSwitcher.setAmount(currentAmount);
        System.out.println("Amount decreased successfully by: " + value);
        
        if(currentAmount <= 0){
            System.out.println("Locking State. Amount is now empty.");
            stateSwitcher.setState(new UnavailableState(stateSwitcher));
        }
    }
    
    @Override
    public void increase(double value) {
        if(value > 0){
            stateSwitcher.setAmount(stateSwitcher.getAmount() + value);
            System.out.println("Amount increased successfully by: " + value);
        }
    }
}
