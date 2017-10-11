package nekio.sample.dp.structural.composite;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.structural.composite.generic.IEntity;

public class CompositeEntity implements IEntity{
    private final List<IEntity> entities;
    private final int id;
    private final String description;
    
    public CompositeEntity(){
        this(0, null);
    }
    
    public CompositeEntity(int id, String description){
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
    public int getId() {
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
