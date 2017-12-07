package nekio.sample.dp.behavioural.command.generic;

/**
 *
 * @author Nekio
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommandQueue {
    private Map<ICommand, Object> commandsQueue;
    private Map<ICommand, Object> results;
    
    public CommandQueue(){
        this.commandsQueue = new HashMap<ICommand, Object>();
        this.results = new HashMap<ICommand, Object>();
    }
    
    public void add(ICommand command){
        this.add(command, null);
    }
    
    public void add(ICommand command, Object parameter){
        commandsQueue.put(command, parameter);
    }
        
    public void removeCommand(ICommand command){
        commandsQueue.remove(command);
    }
    
    public void removeResult(ICommand command){
        results.remove(command);
    }
    
    public void clearAll(){
        commandsQueue.clear();
        results.clear();
    }
    
    public void clearCommandsQueue(){
        commandsQueue.clear();
    }
    
    public void clearResults(){
        results.clear();
    }

    public void workOff() {
        try{
            for(Map.Entry<ICommand, Object> map : commandsQueue.entrySet()) {
                ICommand command = map.getKey();
                Object parameter = map.getValue();

                dispatch(command, parameter);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally{
            clearCommandsQueue();
        }
    }
    
    private void dispatch(ICommand command, Object parameter){
        String idCommand = command.getId();
        
        System.out.println("\nCommandQueue.dispatch(): " + idCommand + " Starts");
        
        Object result = null;
        if(parameter == null){
            command.execute();
        }else{
            result = command.execute(parameter);
        }
        
        results.put(command, result);
    }

    public Set<Map.Entry<ICommand, Object>> getResults() {
        return results.entrySet();
    }
}
