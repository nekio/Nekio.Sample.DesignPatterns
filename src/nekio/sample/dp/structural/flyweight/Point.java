package nekio.sample.dp.structural.flyweight;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.flyweight.generic.Flyweight;

// Intrinsic Class to Flyweight (Extends from "Flyweight" class)
public class Point extends Flyweight{
    private int x;
    private int y;
    
    public Point(){
        this(0, 0);
    }
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setValues(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + "} " + super.toString();
    }    

    // It's very important to override equals and hashCode methods
    // to effectively comparisons between objects
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
        
        final Point other = (Point) obj;
        
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        
        hash = 37 * hash + this.x;
        hash = 37 * hash + this.y;
        
        return hash;
    }
}
