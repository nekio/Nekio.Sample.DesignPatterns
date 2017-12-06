package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 * @param <T>
 */

public abstract class State<T extends IStateMachine> implements IState<T> {
    @Override
    public void activate(T t) {
        System.out.println("State.activate()");
    }

    @Override
    public void deactivate(T t) {
        System.out.println("State.deactivate()");
    }

    @Override
    public void acknowledge(T t) {
        System.out.println("State.acknowledge()");
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        
        if (o instanceof IState) {
            IState state = (IState)o;
            
            String currentStateName = this.getClass().getCanonicalName();
            String newStateName = state.getClass().getCanonicalName();
            if(currentStateName.equals(newStateName)){
                result = true;
            }
        }
        
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
}
