package nekio.sample.dp.creational.factorymethod;

/**
 *
 * @author Nekio
 */

public class PluginFactoryMethod {
    public IPlugin create(Class<? extends IPlugin> clazz) throws InstantiationException, IllegalAccessException {
        IPlugin plugin = (IPlugin)clazz.newInstance();
        
        return plugin;
    }
}
