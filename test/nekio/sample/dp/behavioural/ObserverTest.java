package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */


import nekio.sample.dp.behavioural.observer.Observer;
import nekio.sample.dp.behavioural.observer.Observable;

public class ObserverTest {
    public static void main(String[] args) {
        Observer motor1 = new Observer("Motor 1");
        Observer motor2 = new Observer("Motor 2");
        Observer motor3 = new Observer("Motor 3");
        Observer motor4 = new Observer("Motor 4");
        
        Observable throttle = new Observable("Throttle");
        
        throttle.addObserver(motor1);
        throttle.addObserver(motor2);
        throttle.addObserver(motor3);
        throttle.addObserver(motor4);
        
        try {
            throttle.trigger();
            Thread.sleep(1100L);
            
            throttle.trigger();
            Thread.sleep(1100L);
            
            throttle.trigger();
        } catch (Exception e) {}

        throttle.removeObserver(motor1);
        throttle.removeObserver(motor2);
        throttle.removeObservers();
    }
}
