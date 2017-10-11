package nekio.sample.dp.creational.singleton.generic;

/**
 *
 * @author Nekio
 */

import java.util.HashMap;
import java.util.Map;

public class SingletonDictionary {
    private static final Map<String, Object> ELEMENTS = new HashMap<String, Object>();
    
    private SingletonDictionary(){}

    public static <T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T singleton = (T) ELEMENTS.get(clazz.getName());
        if (singleton == null) {
            singleton = clazz.newInstance();
            ELEMENTS.put(clazz.getName(), singleton);
        }
        
        return singleton;
    }
    
    public static Map<String, Object> getElements() {
        return ELEMENTS;
    }
}
