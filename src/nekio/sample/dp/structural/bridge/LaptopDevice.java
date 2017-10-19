package nekio.sample.dp.structural.bridge;

/**
 *
 * @author Nekio
 */

public class LaptopDevice extends Device<OperatingSystem>{
    public LaptopDevice(OperatingSystem inner) {
        super(inner);
        super.setName("Laptop");
    }    
}
