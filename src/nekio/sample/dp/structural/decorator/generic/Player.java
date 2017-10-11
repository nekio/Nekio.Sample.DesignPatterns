package nekio.sample.dp.structural.decorator.generic;

/**
 *
 * @author Nekio
 */

public class Player implements IPlayer{
    private String name;
    
    public Player(String name){
        this.name = name;
    }
    
    @Override
    public void start() {
        System.out.println("Player.start()");
    }

    @Override
    public void pause() {
        System.out.println("Player.pause()");
    }

    @Override
    public void stop() {
        System.out.println("Player.stop()");
    }

    @Override
    public void toNext() {
        System.out.println("Player.toNext()");
    }

    @Override
    public void toPrevious() {
        System.out.println("Player.toPrevious()");
    }

    @Override
    public void toFirst() {
        System.out.println("Player.toFirst()");
    }

    @Override
    public void toLast() {
        System.out.println("Player.toLast()");
    }
}
