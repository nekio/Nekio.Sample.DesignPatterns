package nekio.sample.dp.creational.prototype.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public interface IPrototype<T> extends Cloneable{
    public abstract void load(T t);
    public abstract T clone();
}
