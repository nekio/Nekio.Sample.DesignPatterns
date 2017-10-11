package nekio.sample.dp.creational.singleton;

/**
 *
 * @author Nekio
 */
public class Logger {
    private static Logger instance;
    
    private Logger(){}
    
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        
        return instance;
    }
    
    public void print(String message){
        System.out.println(message);
    }
}
