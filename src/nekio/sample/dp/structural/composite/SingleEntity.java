package nekio.sample.dp.structural.composite;

import nekio.sample.dp.structural.composite.generic.IEntity;

/**
 *
 * @author Nekio
 */

public class SingleEntity implements IEntity{
    private final int id;
    private final String description;
    
    public SingleEntity(){
        this(0, null);
    }
    
    public SingleEntity(int id, String description){        
        this.id = id;
        this.description = description;
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
        return "Single Entity{" + "id=" + id + ", description=" + description + '}';
    }
}
