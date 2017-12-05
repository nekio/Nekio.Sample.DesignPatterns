package nekio.sample.dp.behavioural.state.generic;

/**
 *
 * @author Nekio
 */

// A concrete class must define the rules for lock and unlock
// This class is unnecesary, if you choose to create multiple State Classes
// (like AvailableState / Unavailable State), and viceversa.
// To use (or not to use) the Attribute "locked" is the key
public abstract class State implements IState{
    protected boolean locked;
    private double amount;
    
    public double getAmount() {
        return amount;
    }

    public void rise() {
        this.locked = false;
    }

    @Override
    public void increase(double value) {
        if(!locked){
            this.amount += value;
        }
    }

    @Override
    public void decrease(double value) {
        if(!locked){
            this.amount -= value;
        }
    }

    public void demise() {
        this.locked = true;
    }
}
