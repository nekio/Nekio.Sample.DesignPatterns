package nekio.sample.dp.behavioural.command.generic;

/**
 *
 * @author Nekio
 * @param <R> Returning Type
 * @param <P> Parameter Type
 */

public class Command<R,P> implements ICommand<R,P>{
    private R r;
    protected String id;
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public void execute(){
        execute(null);
    }
    
    @Override
    public R execute(P p) {
        System.out.println("Command.execute() - Result:" + r + ", Parameter:" + p);
        
       return r; 
    }
    
    @Override
    public String toString() {
        return id;
    }
}
