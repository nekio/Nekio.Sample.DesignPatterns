package nekio.sample.dp.creational;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.creational.prototype.ServerMachine;
import nekio.sample.dp.creational.prototype.WindowsServer;

public class PrototypeTest {
    public static void main(String[] args) {
        // Prepare an Image
        ServerMachine windowsPrototype = new WindowsServer("Win-Server", "NT");
        windowsPrototype.addSoftware("Antivirus", "McAfee");
        windowsPrototype.addSoftware("Webserver", "Apache");
        windowsPrototype.addSoftware("Database", "Oracle");
        windowsPrototype.load(windowsPrototype);
        System.out.println("Prototype:\n" + windowsPrototype.toString());
        
        // Clone the Image
        System.out.println("\nClones:");
        List<ServerMachine> windowsServers = new ArrayList<ServerMachine>();
        ServerMachine windowsServer = null;
        for (int i = 0; i < 20; i++) {
            windowsServer = windowsPrototype.clone();
            windowsServer.setName("Win-Server" + i);
            windowsServer.setIp("192.168.0." + i);
            
            windowsServers.add(windowsServer);
        }
        
        printList(windowsServers);
    }
    
    private static void printList(List list){
        for(Object object : list){
            System.out.println(object.toString());
        }
    }
}
