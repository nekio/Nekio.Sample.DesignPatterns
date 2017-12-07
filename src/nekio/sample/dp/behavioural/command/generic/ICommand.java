package nekio.sample.dp.behavioural.command.generic;

/**
 *
 * @author Nekio
 * @param <R> Returning Type
 * @param <P> Parameter Type
 */

public interface ICommand<R,P> {
    public abstract String getId();
    public abstract void execute();
    public abstract R execute(P p);
}
