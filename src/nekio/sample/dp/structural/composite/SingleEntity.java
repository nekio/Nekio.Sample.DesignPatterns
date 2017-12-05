package nekio.sample.dp.structural.composite;

import nekio.sample.dp.structural.composite.generic.IEntity;

/**
 *
 * @author Nekio
 */

public class SingleEntity<T> implements IEntity<T>{
    private final T t;
    private final Integer id;
    private final String description;
    
    public SingleEntity(T t){
        this(t, 0, null);
    }
    
    public SingleEntity(T t, Integer id, String description){     
        this.t = t;
        this.id = id;
        this.description = description;
    }
    
    @Override
    public T getEntity() {
        return t;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Single Entity{" + "id=" + id + ", description=" + description + '}';
    }
}
