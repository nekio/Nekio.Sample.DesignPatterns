package nekio.sample.dp.creational.factory.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public class FactoryProvider<T> {
    private static FactoryProvider instance;
    
    private FactoryProvider(){}
    
    public static FactoryProvider getInstance(){
        if(instance == null){
            instance = new FactoryProvider();
        }
        
        return instance;
    }
    
    public IFactory<T> createFactory(Class<? extends IFactory> clazz) throws InstantiationException, IllegalAccessException{
        return (IFactory<T>)clazz.newInstance();
    }
    
    public IFactory<T> createFactory(String className) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return createFactory((Class<? extends IFactory>)Class.forName(className));
    }
}
