package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.structural.bridge.AndroidOS;
import nekio.sample.dp.structural.bridge.IOS;
import nekio.sample.dp.structural.bridge.LaptopDevice;
import nekio.sample.dp.structural.bridge.SmartphoneDevice;
import nekio.sample.dp.structural.bridge.TabletDevice;
import nekio.sample.dp.structural.bridge.WindowsOS;
import nekio.sample.dp.structural.bridge.generic.IBridge;

public class BridgeTest {
    public static void main(String[] args) {
        // Bridge decouples an abstraction from its implementation
        // so that they can vary independently
        List<IBridge> bridges = new ArrayList<IBridge>();
        
        bridges.add(new LaptopDevice(new WindowsOS()));
        bridges.add(new LaptopDevice(new AndroidOS()));
        bridges.add(new TabletDevice(new IOS()));
        bridges.add(new TabletDevice(new WindowsOS()));
        bridges.add(new SmartphoneDevice(new WindowsOS()));
        
        for(IBridge bridge : bridges){
            System.out.println(bridge.toString());
        }
    }
}
