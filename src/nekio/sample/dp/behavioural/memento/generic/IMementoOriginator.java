package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 * @param <M>
 */

public interface IMementoOriginator<S, M extends IMemento> {
    public abstract void setMemento(M memento);
    public abstract void setState(S state);
    public abstract IMemento<S> save();
    public abstract void restore(IMemento<S> m);
}
