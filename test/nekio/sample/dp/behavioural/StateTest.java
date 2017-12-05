package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.state.StateSwitcher;

public class StateTest {
    public static void main(String[] args) {
        StateSwitcher stateSwitcher = new StateSwitcher();
        
        stateSwitcher.increase(500);
        stateSwitcher.decrease(300);
        stateSwitcher.decrease(100);
        stateSwitcher.decrease(200);
        stateSwitcher.decrease(50);
        stateSwitcher.increase(100);
        stateSwitcher.decrease(99);
    }
}
