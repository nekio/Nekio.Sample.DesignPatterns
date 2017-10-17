package nekio.sample.dp.creational;

import nekio.sample.dp.creational.builder.DummyBuilder;
import nekio.sample.dp.creational.builder.generic.Builder;
import nekio.sample.dp.creational.builder.generic.BuilderDirector;
import nekio.sample.dp.dummy.DummyClass;

/**
 *
 * @author Nekio
 */

public class BuilderTest {
    public static void main(String[] args) {
        Builder<DummyClass> builder = new DummyBuilder();
        BuilderDirector<DummyClass> builderDirector = new BuilderDirector<DummyClass>(builder);
        DummyClass dummy = builderDirector.construct();
        
        System.out.println(dummy.toString());
    }
}
