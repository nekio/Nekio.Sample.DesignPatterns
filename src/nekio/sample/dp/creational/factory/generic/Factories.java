package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 */

import java.util.HashMap;
import java.util.Map;

public class Factories {
    private Map<Class, IFactory> factories;
    
    public Factories(){
        this.factories = new HashMap<Class, IFactory>();
    }
    
    public IFactory get(Class clazz){
        return factories.get(clazz);
    }
    
    public void put(Class clazz, IFactory factory){
        factories.put(clazz, factory);
    }
    
    public void remove(Class clazz){
        factories.remove(clazz);
    }
    
    public void clear(){
        factories.clear();
    }
}
