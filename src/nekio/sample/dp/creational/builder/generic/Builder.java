package nekio.sample.dp.creational.builder.generic;

/**
 *
 * @author Nekio
 */

public abstract class Builder<T> implements IBuilder{
    public abstract Builder create();
    public abstract Builder initialize();
    public abstract Builder activate();
}
