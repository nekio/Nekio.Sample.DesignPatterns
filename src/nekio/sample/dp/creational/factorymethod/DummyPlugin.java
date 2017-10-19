package nekio.sample.dp.creational.factorymethod;

/**
 *
 * @author Nekio
 */
public class DummyPlugin extends Plugin{
    @Override
    public void activate() {
        System.out.println("Dummy Plugin activate");
    }

    @Override
    public void initialize() {
        System.out.println("Dummy Plugin initialize");
    }

    @Override
    public void uninitialize() {
        System.out.println("Dummy Plugin uninitialize");
    }

    @Override
    public void deactivate() {
        System.out.println("Dummy Plugin deactivate");
    }

    @Override
    public void dispose() {
        System.out.println("Dummy Plugin dispose");
    }
}

