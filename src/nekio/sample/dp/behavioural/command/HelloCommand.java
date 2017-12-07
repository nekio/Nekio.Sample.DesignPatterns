package nekio.sample.dp.behavioural.command;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.command.generic.Command;

public class HelloCommand extends Command<String, String>{
    public HelloCommand(){
        super.id = "HelloCommand";
    }
    
    @Override
    public String execute(String text) {
        super.execute(text);
        System.out.println("HelloCommand.execute()");
        
        return "Hello " + text;
    }
}
