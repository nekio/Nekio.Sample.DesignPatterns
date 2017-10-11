package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public interface IFactory<T> {
    public abstract T create();
    public abstract T getT();
}
