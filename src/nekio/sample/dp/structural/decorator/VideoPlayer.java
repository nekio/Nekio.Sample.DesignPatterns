package nekio.sample.dp.structural.decorator;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.decorator.generic.IPlayer;
import nekio.sample.dp.structural.decorator.generic.PlayerDecorator;

// Clase que ocupa el decorador para extender funcionalidad
public class VideoPlayer extends PlayerDecorator{
    public VideoPlayer(IPlayer player){
        super(player);
    }
    
    @Override
    public void start() {
        super.getPlayer().start();
        System.out.println("VideoPlayer.start()");
    }

    @Override
    public void pause() {
        super.getPlayer().pause();
        System.out.println("VideoPlayer.pause()");
    }

    @Override
    public void stop() {
        super.getPlayer().stop();
        System.out.println("VideoPlayer.stop()");
    }

    @Override
    public void toNext() {
        super.getPlayer().toNext();
        System.out.println("VideoPlayer.toNext()");
    }

    @Override
    public void toPrevious() {
        super.getPlayer().toPrevious();
        System.out.println("VideoPlayer.toPrevious()");
    }

    @Override
    public void toFirst() {
        super.getPlayer().toFirst();
        System.out.println("VideoPlayer.toFirst()");
    }

    @Override
    public void toLast() {
        super.getPlayer().toLast();
        System.out.println("VideoPlayer.toLast()");
    }
}
