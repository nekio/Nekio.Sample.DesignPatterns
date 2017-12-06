package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 * @param <T>
 */

public class StateB<T extends IStateMachine> extends State<T>{
    @Override
    public void activate(T t) {
        super.activate(t);
        System.out.println("StateB.activate()");
        
        t.changeState(new StateA());
    }

    @Override
    public void deactivate(T t) {
        super.deactivate(t);
        System.out.println("StateB.deactivate()");
        t.changeState(new StateC());
    }

    @Override
    public void acknowledge(T t) {
        super.acknowledge(t);
        System.out.println("StateB.acknowledge()");
        t.changeState(new StateB());
    }
    
    @Override
    public String toString() {
        return "StateB{" + "Intermedium State" + '}';
    }
}

