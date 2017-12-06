package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 * @param <T>
 */

public class StateA<T extends IStateMachine> extends State<T>{
    @Override
    public void activate(T t) {
        super.activate(t);
        System.out.println("StateA.activate()");
        
        t.changeState(new StateC());
    }

    @Override
    public void deactivate(T t) {
        super.deactivate(t);
        System.out.println("StateA.deactivate()");
        t.changeState(new StateB());
    }

    @Override
    public void acknowledge(T t) {
        super.acknowledge(t);
        System.out.println("StateA.acknowledge()");
        t.changeState(new StateA());
    }

    @Override
    public String toString() {
        return "StateA{" + "Initial State" + '}';
    }
}
