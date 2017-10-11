package nekio.sample.dp.structural.decorator.generic;

/**
 *
 * @author Nekio
 */

public abstract class PlayerDecorator implements IPlayer{
    private IPlayer player;
    
    public PlayerDecorator(IPlayer player){
        System.out.println("\nPlayerDecorator() - Initializing");
        this.player = player;
    }
    
    protected IPlayer getPlayer(){
        return player;
    }
}
