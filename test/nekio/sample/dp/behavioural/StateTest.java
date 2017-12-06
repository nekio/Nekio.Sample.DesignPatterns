package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.state.StateSwitcher;
import nekio.sample.dp.behavioural.state.multiple.IStateMachine;
import nekio.sample.dp.behavioural.state.multiple.StateMachine;

public class StateTest {
    public static void main(String[] args) {
        testSimpleStates();
        testMultipleStates();
    }
    
    private static void testSimpleStates(){
        StateSwitcher stateSwitcher = new StateSwitcher();
        
        stateSwitcher.increase(500);
        stateSwitcher.decrease(300);
        stateSwitcher.decrease(100);
        stateSwitcher.decrease(200);
        stateSwitcher.decrease(50);
        stateSwitcher.increase(100);
        stateSwitcher.decrease(99);
    }
    
    private final static int ACTIVATE = 0;
    private final static int DEACTIVATE = 1;
    private final static int ACKNOWLEDGE = 2;
    
    private static void testMultipleStates(){
        IStateMachine stateMachine = new StateMachine();
 
        int[] transitions = {
            ACKNOWLEDGE,
            DEACTIVATE,
            ACKNOWLEDGE,
            DEACTIVATE,
            ACTIVATE,
            ACKNOWLEDGE,
            DEACTIVATE,
            ACTIVATE,
            ACTIVATE,
            ACTIVATE,
            DEACTIVATE,
            DEACTIVATE,
        };
        
        for (int transition : transitions) {
            if (transition == 0) {
                stateMachine.activate();
            } else if (transition == 1) {
                stateMachine.deactivate();
            } else if (transition == 2) {
                stateMachine.acknowledge();
            }
        }
    }
}
