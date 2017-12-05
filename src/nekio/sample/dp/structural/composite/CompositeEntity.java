package nekio.sample.dp.structural.composite;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.structural.composite.generic.IEntity;

public class CompositeEntity<T> implements IEntity<T>{
    private final T t;
    private final List<IEntity> entities;
    private final Integer id;
    private final String description;
    
    public CompositeEntity(T t){
        this(t, 0, null);
    }
    
    public CompositeEntity(T t, Integer id, String description){
        this.t = t;
        this.entities = new ArrayList<IEntity>();
        
        this.id = id;
        this.description = description;
    }
    
    public void add(IEntity entity){
        entities.add(entity);
    }
    
    public void remove(IEntity entity){
        entities.remove(entity);
    }
    
    public void clear(){
        entities.clear();
    }
    
    public List<IEntity> getEntities() {
        return entities;
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
        StringBuilder text = new StringBuilder("Composite Entity{");
        text.append("id=" + id);
        text.append(", description=" + description);
        text.append(", entities=" + entities.size());        
        text.append("}");
        
        return text.toString();
    }
}
