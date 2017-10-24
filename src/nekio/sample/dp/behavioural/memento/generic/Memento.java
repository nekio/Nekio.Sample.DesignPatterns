package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 */

public abstract class Memento<S> implements IMemento<S> {
    private S state;
    
    public Memento(S state) {
        this.state = state;
    }
    
    @Override
    public S getState() {
        return state;
    }
    
    @Override
    public void setState(S state){
        this.state = state;
    }
}
