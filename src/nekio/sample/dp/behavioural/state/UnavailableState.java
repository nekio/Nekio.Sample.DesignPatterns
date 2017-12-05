package nekio.sample.dp.behavioural.state;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.state.generic.IState;

public class UnavailableState implements IState{
    private StateSwitcher stateSwitcher;
    
    public UnavailableState(StateSwitcher stateSwitcher){
        System.out.println("< Turning Unavailable State >");
        this.stateSwitcher = stateSwitcher;
    }
    
    @Override
    public void decrease(double value) {
        System.out.println("Unavailable movement");
    }
    
    @Override
    public void increase(double value) {
        if(value > 0){
            stateSwitcher.setState(new AvailableState(stateSwitcher));
            stateSwitcher.setAmount(stateSwitcher.getAmount() + value);
        }
    }
}
