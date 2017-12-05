package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public interface IFactory<T> {
    public abstract T create();
    public abstract T create(Class clazz);
    public abstract T create(Class clazz, Object... params);
    public abstract void setGenericConstructorParams(boolean genericConstructorParams);
}
