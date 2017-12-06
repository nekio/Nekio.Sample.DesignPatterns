package nekio.sample.dp.behavioural.chainofresponsibility.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public interface IHandler<T> {
    public abstract void setRootHandler(IHandler handler);
    public abstract void add(IHandler nextHandler);
    public abstract void execute();
    public abstract void execute(T t);
}
