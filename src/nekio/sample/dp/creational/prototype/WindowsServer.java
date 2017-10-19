package nekio.sample.dp.creational.prototype;

/**
 *
 * @author Nekio
 */
public class WindowsServer extends ServerMachine{
    private String edition;
    
    public WindowsServer(){
        this("", "");
    }
    
    public WindowsServer(ServerMachine server){
        super(server);
    }
    
    public WindowsServer(String name, String edition) {
        super("Windows Server", name);
        this.edition = edition;
    }
    
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "WindowsServer{edition=" + edition + super.toString() + '}';
    }
}
