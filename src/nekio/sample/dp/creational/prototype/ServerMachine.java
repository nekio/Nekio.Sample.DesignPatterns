package nekio.sample.dp.creational.prototype;

/**
 *
 * @author Nekio
 */

import java.util.HashMap;
import java.util.Map;
import nekio.sample.dp.creational.prototype.generic.Prototype;

public abstract class ServerMachine extends Prototype<ServerMachine>{
    private String os;
    private String name;
    private String ip;
    private Map<String, String> software;

    public ServerMachine(){
        this(null, null);
    }
    
    public ServerMachine(ServerMachine server){
        this.software = new HashMap<String, String>();
        this.software.putAll(server.software);
        
        this.os = server.os;
        this.name = server.name;
        this.ip = server.ip;
    }
    
    public ServerMachine(String os, String name) {
        this.software = new HashMap<String, String>();
        
        this.os = os;
        this.name = name;        
    }
    
    public void addSoftware(String type, String name) {
        this.software.put(type, name);
    }
    
    public void removeSoftware(String type, String name) {
        this.software.remove(type, name);
    }
    
    public void clearSoftware(String type, String name) {
        this.software.clear();
    }
    
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Map<String, String> getSoftware() {
        return software;
    }

    @Override
    public String toString() {
        return "ServerMachine{" + "os=" + os + ", name=" + name + ", ip=" + ip + ", software=" + software.size() + '}';
    }
}
