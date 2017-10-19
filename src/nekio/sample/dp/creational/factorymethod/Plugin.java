package nekio.sample.dp.creational.factorymethod;

/**
 *
 * @author Nekio
 */

public abstract class Plugin implements IPlugin{
    // Protected Constructor is a recommendation
    protected Plugin(){}
    
    @Override
    public void activate() {
        System.out.println("Plugin activate");
    }

    @Override
    public void initialize() {
        System.out.println("Plugin initialize");
    }

    @Override
    public void uninitialize() {
        System.out.println("Plugin uninitialize");
    }

    @Override
    public void deactivate() {
        System.out.println("Plugin deactivate");
    }

    @Override
    public void dispose() {
        System.out.println("Plugin dispose");
    }
}
