package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.dummy.DummyClass;
import nekio.sample.dp.dummy.IDummy;
import nekio.sample.dp.structural.proxy.generic.IProxy;
import nekio.sample.dp.structural.proxy.generic.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        try {
            
            // WHEN YOU GET A CONCRETE CLASS
            
            // Non-Static way
            IProxy proxy1 = new Proxy<IDummy>(DummyClass.class);
            IDummy dummy1 = (DummyClass)proxy1.unproxy();
            dummy1.printDummy();
            
            // Static way
            IDummy dummy2 = Proxy.getInstance(DummyClass.class);            
            dummy2.printDummy();
            
            // WHEN YOU DON'T GET A CONCRETE CLASS
            
            // Non-Static way
            IProxy proxy3 = new Proxy<IDummy>("nekio.sample.dp.dummy.DummyClass");
            IDummy dummy3 = (IDummy)proxy3.unproxy();
            dummy3.printDummy();
            
            // Static way
            IDummy dummy4 = Proxy.getInstance("nekio.sample.dp.dummy.DummyClass");            
            dummy4.printDummy();
        } catch (Exception e) {
        }
    }
}
