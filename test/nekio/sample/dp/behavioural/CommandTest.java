package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */

import java.util.Map;
import nekio.sample.dp.behavioural.command.AnyClass;
import nekio.sample.dp.behavioural.command.CustomCommand;
import nekio.sample.dp.behavioural.command.DummyWrapperCommand;
import nekio.sample.dp.behavioural.command.HelloCommand;
import nekio.sample.dp.behavioural.command.TimeCommand;
import nekio.sample.dp.behavioural.command.generic.CommandQueue;
import nekio.sample.dp.behavioural.command.generic.ICommand;
import nekio.sample.dp.behavioural.command.generic.ReflectCommand;
import nekio.sample.dp.behavioural.command.generic.WrapperCommand;
import nekio.sample.dp.dummy.DummyClass;

public class CommandTest {
    public static void main(String[] args) {
        singleCommand();
        wrapperCommand();
        commandQueue();
        reflectedCommand();
    }
    
    private static void singleCommand(){
        System.out.println("Execute a Single Command");
        ICommand command = new CustomCommand();
        command.execute();
    }
    
    private static void wrapperCommand(){
        System.out.println("\nExecute a Wrapper Command");
        WrapperCommand wrapper = new WrapperCommand();
        
        DummyClass dummy = new DummyClass();
        dummy.setName("Nekio");
        ICommand command = new DummyWrapperCommand(dummy);
        
        //executing command by itself
        //command.execute(); 
        //command.execute("concatenate text"); 
        
        // executing command by the wrapper
        wrapper.execute(command); 
    }
    
    private static void commandQueue(){
        System.out.println("\nExecute a Command Queue");
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.add(new CustomCommand());
        commandQueue.add(new TimeCommand());
        commandQueue.add(new HelloCommand(), "World");
        
        commandQueue.workOff();
        
        System.out.println("\nResults:");
        for(Map.Entry<ICommand, Object> map : commandQueue.getResults()){
            ICommand cmd = map.getKey();
            Object result = map.getValue();
            
            System.out.println(cmd.toString() + " returns " + result);
        }
    }
    
    private static void reflectedCommand(){
        ReflectCommand[] reflectCommands = {
            new ReflectCommand(new AnyClass(), "add", new Integer[] {8, 3}),
            new ReflectCommand(new HelloCommand(), "execute", new String[] {"World"}),
            new ReflectCommand(new TimeCommand(), "execute", null)
        };
        
        System.out.println("\nReflection results:  ");
        for (ReflectCommand command : reflectCommands) {
            command.execute();
        }
    }
}
