package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 * @param <T>
 */

public interface IState<T extends IStateMachine> {
    // State does need parameters
    public void activate(T t);
    public void deactivate(T t);
    public void acknowledge(T t);
}
