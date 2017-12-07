package nekio.sample.dp.behavioural.command;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.command.generic.Command;

public class CustomCommand extends Command{
    public CustomCommand(){
        super.id = "CustomCommand";
    }
    
    @Override
    public void execute() {
        super.execute();
        System.out.println("CustomCommand.execute()");
    }
}
