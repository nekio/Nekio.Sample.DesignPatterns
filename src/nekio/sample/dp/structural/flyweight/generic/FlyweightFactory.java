package nekio.sample.dp.structural.flyweight.generic;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory<T>{
    private static List<IFlyweight> flyweightPool;
    
    public FlyweightFactory(){
        flyweightPool = new ArrayList<IFlyweight>();
    }
    
    public void removeFlyweightElement(IFlyweight flyweight){
        flyweightPool.remove(flyweight);
    }
    
    public void clearFlyweights(){
        flyweightPool.clear();
    }
    
    public IFlyweight create(T t) {
        IFlyweight result = null;
        
        //check if we've already created an object with this Intrinsic state
        T intrinsic = null;
        for (IFlyweight flyweightPoolElement : flyweightPool) {
            intrinsic = (T)flyweightPoolElement.getIntrinsic();
            
            if (intrinsic.equals(t)) {
                result = flyweightPoolElement;
                break;
            }
        }

        if(result == null){
            result = new Flyweight(t);
            flyweightPool.add(result);
        }
        
        return result;
    }
}
