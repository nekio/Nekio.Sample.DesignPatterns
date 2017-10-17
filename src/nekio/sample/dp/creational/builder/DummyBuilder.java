package nekio.sample.dp.creational.builder;

/**
 *
 * @author Nekio
 */

import java.util.Date;
import nekio.sample.dp.creational.builder.generic.Builder;
import nekio.sample.dp.dummy.DummyClass;

public class DummyBuilder extends Builder{
    private DummyClass dummy;

    @Override
    public Builder create() {
        System.out.println("DummyBuilder - Creating");
        dummy = new DummyClass();
        
        return this;
    }

    @Override
    public Builder initialize() {
        System.out.println("DummyBuilder - Initializing");
        
        dummy.setId(1);
        dummy.setName("dummy name");
        
        return this;
    }

    @Override
    public Builder activate() {
        System.out.println("DummyBuilder - Activating");
        
        dummy.setDate(new Date());
                
        return this;
    }
    
    @Override
    public DummyClass build() {
        System.out.println("DummyBuilder - Building");
        
        return dummy;
    }
}
