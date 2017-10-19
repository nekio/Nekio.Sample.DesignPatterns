package nekio.sample.dp.structural.bridge;

/**
 *
 * @author Nekio
 */

public class SmartphoneDevice extends Device<OperatingSystem>{
    public SmartphoneDevice(OperatingSystem inner) {
        super(inner);
        super.setName("Smartphone");
    }
}
