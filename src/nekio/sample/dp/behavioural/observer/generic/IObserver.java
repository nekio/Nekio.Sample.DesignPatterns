package nekio.sample.dp.behavioural.observer.generic;

/**
 *
 * @author Nekio
 */

public interface IObserver {
    public abstract String getDescription();
    public abstract void update(String message);
}
