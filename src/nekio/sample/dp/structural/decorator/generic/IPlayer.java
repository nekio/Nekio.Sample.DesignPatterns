package nekio.sample.dp.structural.decorator.generic;

/**
 *
 * @author Nekio
 */

public interface IPlayer {
    public abstract void start();
    public abstract void pause();
    public abstract void stop();
    
    public abstract void toNext();
    public abstract void toPrevious();
    
    public abstract void toFirst();
    public abstract void toLast();
}
