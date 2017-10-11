package nekio.sample.dp.structural.proxy.generic;

/**
 *
 * @author Nekio
 * @param <P>
 */
public class Proxy<P> implements IProxy<P>{
    private final P p;
    
    public Proxy(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        this(Class.forName(className));
    }
    
    public Proxy(Class clazz) throws InstantiationException, IllegalAccessException{
        this.p = (P)clazz.newInstance();
    }
    
    public static <P> P getInstance(String className) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return getInstance((Class<P>)Class.forName(className));
    }
    
    public static <P> P getInstance(Class<P> clazz) throws IllegalAccessException, InstantiationException {
       return (P)clazz.newInstance();
    }

    @Override
    public P unproxy() {
        return p;
    }
}
