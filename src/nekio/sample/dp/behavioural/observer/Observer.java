package nekio.sample.dp.behavioural.observer;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.observer.generic.IObserver;

public class Observer implements IObserver{
    private final String description;
    
    public Observer(String description){
        this.description = description;
    }
    
    @Override
    public void update(String message) {
        System.out.println("Observer " + description + ", raise an action from " + message);
    }

    @Override
    public String getDescription() {
        return description;
    }
}
