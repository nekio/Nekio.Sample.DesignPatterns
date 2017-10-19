package nekio.sample.dp.creational.factorymethod;

/**
 *
 * @author Nekio
 */

public interface IPlugin {
    public abstract void activate();
    public abstract void initialize();
    
    public abstract void uninitialize();
    public abstract void deactivate();
    public abstract void dispose();
}
