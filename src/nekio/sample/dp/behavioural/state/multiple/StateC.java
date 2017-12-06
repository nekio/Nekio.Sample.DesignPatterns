package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 */

public class StateC<T extends IStateMachine> extends State<T>{
    @Override
    public void activate(T t) {
        super.activate(t);
        System.out.println("StateC.activate()");
        
        t.changeState(new StateB());
    }

    @Override
    public void deactivate(T t) {
        super.deactivate(t);
        System.out.println("StateC.deactivate()");
        t.changeState(new StateA());
    }

    @Override
    public void acknowledge(T t) {
        super.acknowledge(t);
        System.out.println("StateC.acknowledge()");
        t.changeState(new StateC());
    }
    
    @Override
    public String toString() {
        return "StateC{" + "Final State" + '}';
    }
}

