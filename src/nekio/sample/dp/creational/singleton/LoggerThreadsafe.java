package nekio.sample.dp.creational.singleton;

/**
 *
 * @author Nekio
 */
public class LoggerThreadsafe {
    private static LoggerThreadsafe instance;
    
    private LoggerThreadsafe(){}
    
    public static LoggerThreadsafe getInstance(){
        // prevent redundant locks
        if(instance == null){
            
            // mutual exclusion (lock thread)
            // NOTE: Always prefer to lock a specific block,
            // instead of the entire method, to keep a better performance
            synchronized (LoggerThreadsafe.class) {
                
                // check that there is no such object
                if(instance == null){
                    instance = new LoggerThreadsafe();
                }
            }
        }
        
        return instance;
    }
    
    public void print(String message){
        System.out.println(message);
    }
}
