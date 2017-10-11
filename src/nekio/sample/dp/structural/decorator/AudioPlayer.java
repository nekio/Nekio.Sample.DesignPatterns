package nekio.sample.dp.structural.decorator;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.decorator.generic.IPlayer;

// Clase que NO ocupa el decorador, y debe definir por completo su funcionalidad (no reusa comporamientos)
public class AudioPlayer implements IPlayer{
    private String name;
    
    public AudioPlayer(String name){
        System.out.println("AudioPlayer() - Creating " + name);
        this.name = name;
    }
    
    @Override
    public void start() {
        System.out.println("AudioPlayer.start()");
    }

    @Override
    public void pause() {
        System.out.println("AudioPlayer.pause()");
    }

    @Override
    public void stop() {
        System.out.println("AudioPlayer.stop()");
    }

    @Override
    public void toNext() {
        System.out.println("AudioPlayer.toNext()");
    }

    @Override
    public void toPrevious() {
        System.out.println("AudioPlayer.toPrevious()");
    }

    @Override
    public void toFirst() {
        System.out.println("AudioPlayer.toFirst()");
    }

    @Override
    public void toLast() {
        System.out.println("AudioPlayer.toLast()");
    }
}
