package nekio.sample.dp.behavioural.command.generic;

/**
 *
 * @author Nekio
 */

public class WrapperCommand {
    public void execute(ICommand command){
        command.execute();
    }
}
