package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GenericFactory<T> extends Factory{
    public GenericFactory(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        this(Class.forName(className));
    }
    
    public GenericFactory(Class clazz) throws InstantiationException, IllegalAccessException {
        super.t = (T)clazz.newInstance();
    }
    
    public GenericFactory(Class clazz, Object param) throws InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Constructor classConstructor = clazz.getConstructor(clazz.getSuperclass());
        super.t = (T)classConstructor.newInstance(param);
    }
}
