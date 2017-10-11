package nekio.sample.dp.creational.factory;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.creational.factory.generic.Factory;
import nekio.sample.dp.dummy.DummyClass;

public class DummyFactory extends Factory{

    @Override
    public DummyClass create() {
        return new DummyClass();
    }
}
