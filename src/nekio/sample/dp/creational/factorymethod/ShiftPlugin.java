package nekio.sample.dp.creational.factorymethod;

/**
 *
 * @author Nekio
 */

public class ShiftPlugin extends Plugin{
    @Override
    public void activate() {
        System.out.println("Shift Plugin activate");
    }

    @Override
    public void initialize() {
        System.out.println("Shift Plugin initialize");
    }

    @Override
    public void uninitialize() {
        System.out.println("Shift Plugin uninitialize");
    }

    @Override
    public void deactivate() {
        System.out.println("Shift Plugin deactivate");
    }

    @Override
    public void dispose() {
        System.out.println("Shift Plugin dispose");
    }
}
