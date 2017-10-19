package nekio.sample.dp.creational.prototype.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

import java.lang.reflect.Constructor;

public abstract class Prototype<T> implements IPrototype<T>{
    protected T t;

    @Override
    public void load(T t) {
        this.t = t;
    }

    @Override
    public T clone(){
        T t = null;
        
        try
        {
            Class clazz = this.t.getClass();
            Constructor classConstructor = clazz.getConstructor(clazz.getSuperclass());
            t = (T)classConstructor.newInstance(this.t);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        
        return t;
    }
}
