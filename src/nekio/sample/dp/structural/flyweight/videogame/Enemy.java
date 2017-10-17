package nekio.sample.dp.structural.flyweight.videogame;

/**
 *
 * @author Nekio
 */

// Extrinsic Class to Flyweight
// Need to use an Attribute instead of Inheritance
public class Enemy{
    private Character character;
    
    private Integer damage;
    private Integer hitResistence;
    private Integer hitCounter;
    
    public Enemy(Character character){
        this.character = character;        
        this.character.type = "CPU";        
        this.hitCounter = 0;
    }
    
    public void hit(){
        hitCounter++;
        
        character.active = hitCounter < hitResistence;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHitResistence() {
        return hitResistence;
    }

    public void setHitResistence(Integer hitResistence) {
        this.hitResistence = hitResistence;
    }

    @Override
    public String toString() {
        return "Enemy{" + "damage=" + damage + ", hitResistence=" + hitResistence + ", hitCounter=" + hitCounter + " " + super.toString() + "[" + character.toString() + "]" + '}';
    }
}
