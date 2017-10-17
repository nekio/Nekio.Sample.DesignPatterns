package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 */

public class GenericFactory<T> extends Factory{
    public GenericFactory(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        this(Class.forName(className));
    }
    
    public GenericFactory(Class clazz) throws InstantiationException, IllegalAccessException {
        super.t = (T)clazz.newInstance();
    }
    
    @Override
    public T create(){
        return (T)t;
    }
}
