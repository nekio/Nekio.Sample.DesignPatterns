package nekio.sample.dp.behavioural.state;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.state.generic.IState;

public class StateSwitcher implements IState{
    private double amount;
    private IState state;
    
    public StateSwitcher(){
        this.state = new UnavailableState(this);
    }
    
    @Override
    public void increase(double value) {
        logMovement(value);
        this.state.increase(value);
    }

    @Override
    public void decrease(double value) {
        logMovement(value, false);
        this.state.decrease(value);
    }

    public IState getState() {
        return this.state;
    }

    public void setState(IState state) {
        this.state = state;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void logMovement(double amount){
        logMovement(amount, true);
    }
    
    public void logMovement(double value, boolean increase){
        String sign = increase ? "+" : "-";
        System.out.println("\nCurrent Amount: " + amount + ", Movement: " + sign + value);
    }
}
