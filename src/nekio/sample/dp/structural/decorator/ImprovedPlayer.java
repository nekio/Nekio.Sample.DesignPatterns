package nekio.sample.dp.structural.decorator;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.decorator.generic.IPlayer;
import nekio.sample.dp.structural.decorator.generic.PlayerDecorator;

// Clase tecnicamente igual que VideoPlayer
// pero que se ocupa en el Test como ejemplo de anidamiento de decoradores
public class ImprovedPlayer extends PlayerDecorator{
    public ImprovedPlayer(IPlayer player){
        super(player);
    }
    
    @Override
    public void start() {
        super.getPlayer().start();
        System.out.println("ImprovedPlayer.start()");
    }

    @Override
    public void pause() {
        super.getPlayer().pause();
        System.out.println("ImprovedPlayer.pause()");
    }

    @Override
    public void stop() {
        super.getPlayer().stop();
        System.out.println("ImprovedPlayer.stop()");
    }

    @Override
    public void toNext() {
        super.getPlayer().toNext();
        System.out.println("ImprovedPlayer.toNext()");
    }

    @Override
    public void toPrevious() {
        super.getPlayer().toPrevious();
        System.out.println("ImprovedPlayer.toPrevious()");
    }

    @Override
    public void toFirst() {
        super.getPlayer().toFirst();
        System.out.println("ImprovedPlayer.toFirst()");
    }

    @Override
    public void toLast() {
        super.getPlayer().toLast();
        System.out.println("ImprovedPlayer.toLast()");
    }
}
