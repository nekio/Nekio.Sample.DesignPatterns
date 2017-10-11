package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */
public abstract class Factory<T> implements IFactory<T>{
    protected T t;

    @Override
    public T getT() {
        return t;
    }
}
