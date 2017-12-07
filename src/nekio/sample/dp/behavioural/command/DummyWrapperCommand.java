package nekio.sample.dp.behavioural.command;

import nekio.sample.dp.behavioural.command.generic.Command;
import nekio.sample.dp.dummy.DummyClass;

/**
 *
 * @author Nekio
 */

public class DummyWrapperCommand extends Command<Void,String>{
    private DummyClass dummy;
    
    public DummyWrapperCommand(DummyClass dummy){
        super.id = "DummyWrapperCommand";
        this.dummy = dummy;
    }
    
    @Override
    public Void execute(String concatenate) {
        System.out.println("DummyWrapperCommand.execute()");
        
        dummy.setName("Dummy Class in a Wrapper Command: " + dummy.getName() + " " + concatenate); // concatenate
        dummy.setId(8); // replacing 
        
        System.out.println(dummy.toString());
        
        return null;
    }
}
