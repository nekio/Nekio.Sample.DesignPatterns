package nekio.sample.dp.behavioural.memento;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.memento.generic.Memento;
import nekio.sample.dp.dummy.DummyClass;

public class Stuff extends Memento<DummyClass>{
    public Stuff(DummyClass state) {
        super(state);
    }
}
