package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 * @param <M>
 */

public class GenericMementoOriginator<S, M extends IMemento<S>> extends MementoOriginator<S, M>{}