package nekio.sample.dp.structural.bridge.generic;

/**
 *
 * @author Nekio
 * @param <Inner>
 */

public interface IBridge<Inner> {
    public abstract void setInner(Inner inner);
}
