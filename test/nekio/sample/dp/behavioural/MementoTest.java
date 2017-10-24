package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */

import java.util.Date;
import nekio.sample.dp.behavioural.memento.Stuff;
import nekio.sample.dp.behavioural.memento.StuffPicker;
import nekio.sample.dp.behavioural.memento.generic.GenericMemento;
import nekio.sample.dp.behavioural.memento.generic.GenericMementoOriginator;
import nekio.sample.dp.behavioural.memento.generic.IMemento;
import nekio.sample.dp.behavioural.memento.generic.MementoCaretaker;
import nekio.sample.dp.dummy.DummyClass;

public class MementoTest {
    public static void main(String[] args) throws InterruptedException {
        try {
            concreteProcess();
            genericProcess(DummyClass.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private static void concreteProcess() throws InterruptedException{
        System.out.println("\nCONCRETE PROCESSING...");
        
        MementoCaretaker<DummyClass> caretaker = new MementoCaretaker<DummyClass>();
        
        StuffPicker originator = new StuffPicker();
        Stuff memento = null;    
        
        DummyClass state = null;
        for (int i = 0; i < 10; i++) {
            state = new DummyClass();
            state.setDate(new Date());
            state.setId(i);
            state.setName("State " + i);
            
            memento = new Stuff(state);
            originator.setState(state);
            originator.setMemento(memento);
            
            if(i%2 == 0){
                caretaker.addMemento(originator.save());
            }
            
            System.out.println("\nCurrent Memento:\n" + caretaker.getLastMemento().getState().toString());
            Thread.sleep(1000);
        }
        
        System.out.println("\nPrinting Last Memento");
        System.out.println(caretaker.getLastMemento().getState().toString());
        
        System.out.println("\nRecovering a previous State");
        IMemento previousMemento = caretaker.getMemento(4);
        System.out.println(previousMemento.getState().toString());
        
        System.out.println("\nRestoring Memento");
        originator.restore(previousMemento);
        caretaker.addMemento(originator.save());
        System.out.println(caretaker.getLastMemento().getState().toString());
    }
    
    private static <S> void genericProcess(Class<S> clazz) throws InstantiationException, IllegalAccessException, InterruptedException{
        System.out.println("\nGENERIC PROCESSING...");
        
        MementoCaretaker<S> caretaker = new MementoCaretaker<S>();
        
        GenericMemento<S> memento = null;
        GenericMementoOriginator<S, GenericMemento<S>> originator = new GenericMementoOriginator<S, GenericMemento<S>>();
        
        S state = null;
        for (int i = 0; i < 10; i++) {            
            state = (S)clazz.newInstance();
            
            memento = new GenericMemento(state);
            originator.setState(state);
            originator.setMemento(memento);
            
            if(i%2 == 0){
                caretaker.addMemento(originator.save());
            }
            
            System.out.println("\nCurrent Memento:\n" + caretaker.getLastMemento().getState().toString());
            Thread.sleep(1000);
        }
        
        System.out.println("\nPrinting Last Memento");
        System.out.println(caretaker.getLastMemento().getState().toString());
        
        System.out.println("\nRecovering a previous State");
        IMemento previousMemento = caretaker.getMemento(4);
        System.out.println(previousMemento.getState().toString());
        
        System.out.println("\nRestoring Memento");
        originator.restore(previousMemento);
        caretaker.addMemento(originator.save());
        System.out.println(caretaker.getLastMemento().getState().toString());
    }
}
