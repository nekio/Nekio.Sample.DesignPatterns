package nekio.sample.dp.structural.bridge;

/**
 *
 * @author Nekio
 */

public class TabletDevice extends Device<OperatingSystem>{
    public TabletDevice(OperatingSystem inner) {
        super(inner);
        super.setName("Tablet");
    }
}
