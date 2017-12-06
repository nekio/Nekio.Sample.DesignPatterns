package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 */

public interface IStateMachine {
    public abstract void changeState(IState state);
    
    // State Machine doesn't need parameters
    public abstract void activate();
    public abstract void deactivate();
    public abstract void acknowledge();
}
