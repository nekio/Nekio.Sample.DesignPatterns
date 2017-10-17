package nekio.sample.dp.creational.builder.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public class BuilderDirector<T> {
    private Builder<T> builder;
    
    public BuilderDirector(final Builder<T> builder){
        this.builder = builder;
    }
    
    public T construct(){
        builder = builder.create();
        builder = builder.initialize();
        builder = builder.activate();
        
        return (T)builder.build();
    }
}
