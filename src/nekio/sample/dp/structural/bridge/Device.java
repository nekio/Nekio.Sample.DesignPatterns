package nekio.sample.dp.structural.bridge;

/**
 *
 * @author Nekio
  * @param <OperatingSystem>
 */

import nekio.sample.dp.structural.bridge.generic.Bridge;

public class Device<OperatingSystem> extends Bridge<OperatingSystem>{
    private String name;
    
    public Device(OperatingSystem inner) {
        super(inner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Device{" + "name=" + name + " [" + super.getInner().toString() + "]}";
    }
}
