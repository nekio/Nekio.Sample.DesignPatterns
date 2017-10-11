package nekio.sample.dp.creational.singleton.generic;

/**
 *
 * @author Nekio
 */

public class Singleton {
    private static Object object;
    
    private Singleton(){}

    public static <T> T getInstance(Class<T> t) throws IllegalAccessException, InstantiationException {
        if (object == null) {
            object = t.newInstance();
        }

        return (T) object;
    }
}
