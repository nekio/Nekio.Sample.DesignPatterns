package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 * @param <S>
 * @param <M>
 */

public abstract class MementoOriginator<S, M extends IMemento<S>> implements IMementoOriginator<S, M>{
    private M memento;
    private S state;

    @Override
    public void setMemento(M memento){
        System.out.println("MementoOriginator - Setting Memento: " + memento);
        this.memento = memento;
    }
    
    @Override
    public void setState(S state) {
        System.out.println("MementoOriginator - Setting State: " + state);
        this.state = state;
    }

    @Override
    public IMemento<S> save() {
        System.out.println("MementoOriginator - Saving to Memento");
        this.memento.setState(state);
        
        return this.memento;
    }
    
    @Override
    public void restore(IMemento<S> m) {
        System.out.println("Originator - State before restoring from Memento: " + state);
        state = m.getState();
        System.out.println("Originator - State after restoring from Memento: " + state);
    }
}
