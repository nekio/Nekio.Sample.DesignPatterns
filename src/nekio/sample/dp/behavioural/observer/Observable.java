package nekio.sample.dp.behavioural.observer;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import nekio.sample.dp.behavioural.observer.generic.IObservable;
import nekio.sample.dp.behavioural.observer.generic.IObserver;

public class Observable implements IObservable{
    private final String description;
    private final List<IObserver> observers;
    
    public Observable(String description){
        this.description = description;
        observers = new ArrayList<IObserver>();
    }
    
    public void addObserver(IObserver observer){
        System.out.println("Observable " + description + " - Adding observer: " + observer.getDescription());
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer){
        System.out.println("Removing observer: " + observer.getDescription());
        observers.remove(observer);
    }
    
    public void removeObservers(){
        System.out.println("Removing all observers");
        observers.clear();
    }
    
    public void trigger(){
        this.notificate();
    }
    
    @Override
    public void notificate() {
        for(IObserver observer : observers){
            observer.update(description + "[" + new Date() + "]");
        }
    }

    @Override
    public String getDescription() {
        return description;
    }
}
