package nekio.sample.dp.structural.flyweight.videogame;

/**
 *
 * @author Nekio
 */

import java.util.Objects;

// Intrinsic Class to Flyweight (Not extends from "Flyweight" class)
public class Character{
    protected Integer id;
    protected String name;
    protected String type;
    protected String genre;
    protected Boolean active;
    
    public Character(Character character){
        this(character.id, character.name, character.type, character.genre, character.active);
    }
    
    public Character(Integer id, String name, String type, String genre) {
        this(id, name, type, genre, true);
    }

    public Character(Integer id, String name, String type, String genre, Boolean active) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.genre = genre;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Character{" + "id=" + id + ", name=" + name + ", type=" + type + ", genre=" + genre + ", active=" + active + "} " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Character other = (Character) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.genre);
        hash = 41 * hash + Objects.hashCode(this.active);
        
        return hash;
    }
}
