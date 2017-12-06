package nekio.sample.dp.behavioural.state.multiple;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;

public class StateMachine implements IStateMachine{
    private List<IState> states;
    private IState currentState;
    
    public StateMachine(){
        states = new ArrayList<IState>();
        
        states.add(new StateA());
        states.add(new StateB());
        states.add(new StateC());
        
        // Set StateA as initial
        currentState = states.get(0);
    }

    @Override
    public void changeState(IState state) {
        System.out.print("StateMachine.changeState(): ");
        System.out.println(
            "From " + currentState.toString() +
            ", To " + state.toString() + 
            "\n"
        );
        
        int stateIndex = states.indexOf(state);
        currentState = states.get(stateIndex);
    }
    
    @Override
    public void activate()  {
        currentState.activate(this);
    }

    @Override
    public void deactivate() {
        currentState.deactivate(this);
    }

    @Override
    public void acknowledge() {
        currentState.acknowledge(this);
    }
}
