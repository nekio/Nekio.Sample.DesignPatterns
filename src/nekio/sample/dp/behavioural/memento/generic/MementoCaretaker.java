package nekio.sample.dp.behavioural.memento.generic;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;

public class MementoCaretaker<S> {
    private List<IMemento<S>> mementos;

    public MementoCaretaker(){
        mementos = new ArrayList<IMemento<S>>();
    }
    
    public void addMemento(IMemento<S> m) {
        System.out.println("MementoCaretaker - Adding Memento");
        mementos.add(m);
    }

    public IMemento<S> getLastMemento() {
         return getMemento(mementos.size());
    }
    
    public IMemento<S> getMemento(int mementoIndex) {
        IMemento<S> memento = null;
        
        if(mementos.size() > 0){
            memento = mementos.get(mementoIndex - 1);
        }

         return memento;
    }
}
