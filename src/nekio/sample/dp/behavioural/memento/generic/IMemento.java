package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 */

public interface IMemento<S> {
    public abstract S getState();
    public abstract void setState(S s);
}
