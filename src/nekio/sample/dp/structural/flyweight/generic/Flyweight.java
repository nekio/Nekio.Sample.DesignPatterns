package nekio.sample.dp.structural.flyweight.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public class Flyweight<T> implements IFlyweight{
    private final T intrinsic;
    
    public Flyweight(){
        this(null);
    }
    
    public Flyweight(T intrinsic){
        this.intrinsic = intrinsic;
    }
    
    @Override
    public T getIntrinsic() {
        return intrinsic;
    }
}
