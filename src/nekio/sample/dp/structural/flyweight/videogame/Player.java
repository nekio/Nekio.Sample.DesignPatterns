package nekio.sample.dp.structural.flyweight.videogame;

/**
 *
 * @author Nekio
 */

// Extrinsic Class to Flyweight
// Need to use an Attribute instead of Inheritance
public class Player{
    private Character character;
    
    private String alias;
    private Integer specialMoves;
    private Integer lifes;
    
    public Player(Character character){
        this.character = character;        
        this.character.type = "Human";
    }
    
    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getSpecialMoves() {
        return specialMoves;
    }

    public void setSpecialMoves(Integer specialMoves) {
        this.specialMoves = specialMoves;
    }

    public Integer getLifes() {
        return lifes;
    }

    public void setLifes(Integer lifes) {
        this.lifes = lifes;
    }

    @Override
    public String toString() {
        return "Player{" + "alias=" + alias + ", specialMoves=" + specialMoves + ", lifes=" + lifes + super.toString() + "[" + character.toString() + "]" + '}';
    }
}
