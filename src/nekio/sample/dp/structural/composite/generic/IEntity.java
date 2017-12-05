package nekio.sample.dp.structural.composite.generic;

/**
 *
 * @author Nekio
 */

public interface IEntity<T> {
    public abstract T getEntity();
    public abstract Integer getId();
    public abstract String getDescription();
}
