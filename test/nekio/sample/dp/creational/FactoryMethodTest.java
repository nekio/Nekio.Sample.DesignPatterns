package nekio.sample.dp.creational;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.creational.factorymethod.DummyPlugin;
import nekio.sample.dp.creational.factorymethod.IPlugin;
import nekio.sample.dp.creational.factorymethod.PluginFactoryMethod;
import nekio.sample.dp.creational.factorymethod.ShiftPlugin;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PluginFactoryMethod factoryMethod = new PluginFactoryMethod();
        try {
            IPlugin dummyPlugin = factoryMethod.create(DummyPlugin.class);
            IPlugin shiftPlugin = factoryMethod.create(ShiftPlugin.class);
            
            processPlugin(dummyPlugin);
            processPlugin(shiftPlugin);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private static void processPlugin(IPlugin plugin){
        plugin.activate();
        plugin.initialize();
        plugin.uninitialize();
        plugin.deactivate();
        plugin.dispose();
    }
}
