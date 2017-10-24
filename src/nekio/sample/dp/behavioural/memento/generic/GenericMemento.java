package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 */

public class GenericMemento<S> extends Memento<S>{
    public GenericMemento(S state) {
        super(state);
    }
}