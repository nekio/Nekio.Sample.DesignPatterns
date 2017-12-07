package nekio.sample.dp.behavioural.command;

/**
 *
 * @author Nekio
 */

import java.util.Date;
import nekio.sample.dp.behavioural.command.generic.Command;

public class TimeCommand extends Command{
    public TimeCommand(){
        super.id = "TimeCommand";
    }
    
    @Override
    public void execute() {
        super.execute();
        System.out.println("TimeCommand.execute(): " + new Date());
    }
}
