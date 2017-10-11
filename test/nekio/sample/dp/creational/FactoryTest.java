package nekio.sample.dp.creational;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.creational.factory.DummyFactory;
import nekio.sample.dp.creational.factory.GenericFactory;
import nekio.sample.dp.creational.factory.generic.Factories;
import nekio.sample.dp.creational.factory.generic.FactoryProvider;
import nekio.sample.dp.creational.factory.generic.IFactory;
import nekio.sample.dp.dummy.IDummy;

public class FactoryTest {
    public static void main(String[] args) {
        // Single Concrete Factory
        IFactory factory1 = new DummyFactory();
        IDummy dummy1 = (IDummy)factory1.create();
        dummy1.printDummy();
        
        // Single Generic Factory
        try {
            IFactory<IDummy> factory2 = new GenericFactory<IDummy>("nekio.sample.dp.dummy.DummyClass");
            //IFactory<IDummy> factory = new GenericFactory<IDummy>(DummyClass.class);
            IDummy dummy2 = (IDummy) factory2.create();
            dummy2.printDummy();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            FactoryProvider<DummyFactory> factoryProvider = FactoryProvider.getInstance();
            //IFactory factory3 = factoryProvider.createFactory("nekio.sample.dp.creational.factory.DummyFactory");
            IFactory factory3 = factoryProvider.createFactory(DummyFactory.class);

            IDummy dummy3 = (IDummy)factory3.create();
            dummy3.printDummy();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // Map of Factories
        Factories factories = null;
        try {
            factories = new Factories();
            factories.put(IDummy.class, new DummyFactory());
            
            IFactory factory4 = factories.get(IDummy.class);
            IDummy dummy4 = (IDummy)factory4.create();
            dummy4.printDummy();
            
            factories.clear();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            factories = null;
        }
    }
}
