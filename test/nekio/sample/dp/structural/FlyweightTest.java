package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.structural.flyweight.Point;
import nekio.sample.dp.structural.flyweight.generic.FlyweightFactory;
import nekio.sample.dp.structural.flyweight.generic.IFlyweight;
import nekio.sample.dp.structural.flyweight.videogame.Character;
import nekio.sample.dp.structural.flyweight.videogame.Enemy;

public class FlyweightTest {
    public static void main(String[] args) {
        // Creating a List of IFlyweight types
        testPoint();
        
        // Creating a List of Concrete types
        testPlayer();
    }
    
    private static void testPoint(){
        FlyweightFactory<Point> factory = new FlyweightFactory<Point>();
        
        List<Point> diagonalLeft = new ArrayList<Point>();
        List<Point> diagonalRight = new ArrayList<Point>();
        List<Point> verticalLine = new ArrayList<Point>();
        List<Point> horizontalLine = new ArrayList<Point>();
        
        //IFlyweight fly = factory.create(new Point(1,1));
        //Point point = (Point)fly.getIntrinsic();
        
        diagonalLeft.add((Point)factory.create(new Point(1,1)).getIntrinsic());
        diagonalLeft.add((Point)factory.create(new Point(2,2)).getIntrinsic());
        diagonalLeft.add((Point)factory.create(new Point(3,3)).getIntrinsic());
        diagonalLeft.add((Point)factory.create(new Point(4,4)).getIntrinsic());
        diagonalLeft.add((Point)factory.create(new Point(5,5)).getIntrinsic());

        diagonalRight.add((Point)factory.create(new Point(1,5)).getIntrinsic());
        diagonalRight.add((Point)factory.create(new Point(2,4)).getIntrinsic());
        diagonalRight.add((Point)factory.create(new Point(3,3)).getIntrinsic()); //repeated
        diagonalRight.add((Point)factory.create(new Point(4,2)).getIntrinsic());
        diagonalRight.add((Point)factory.create(new Point(5,1)).getIntrinsic());

        verticalLine.add((Point)factory.create(new Point(1,3)).getIntrinsic());
        verticalLine.add((Point)factory.create(new Point(2,3)).getIntrinsic());
        verticalLine.add((Point)factory.create(new Point(3,3)).getIntrinsic()); //repeated
        verticalLine.add((Point)factory.create(new Point(4,3)).getIntrinsic());
        verticalLine.add((Point)factory.create(new Point(5,3)).getIntrinsic());

        horizontalLine.add((Point)factory.create(new Point(3,1)).getIntrinsic());
        horizontalLine.add((Point)factory.create(new Point(3,2)).getIntrinsic());
        horizontalLine.add((Point)factory.create(new Point(3,3)).getIntrinsic()); //repeated
        horizontalLine.add((Point)factory.create(new Point(3,4)).getIntrinsic());
        horizontalLine.add((Point)factory.create(new Point(3,5)).getIntrinsic());

        // For all Lists [Point(3,3)] always is the same Heap Object 
        System.out.println("Printing Diagonal Left:");
        printFlyweights(diagonalLeft);

        System.out.println("\nPrinting Diagonal Right:");
        printFlyweights(diagonalRight);

        System.out.println("\nPrinting Vertical Line:");
        printFlyweights(verticalLine);

        System.out.println("\nPrinting Horizontal Line:");
        printFlyweights(horizontalLine);
    }
    
    private static void testPlayer(){
        // For this generic implementation, is important to take care of
        // use an attribute type of "super class" instead of inheritance in "class child"
        // in this specific example, "Enemy" and "Player" classes have an "Character" attribute
        FlyweightFactory<Character> flyweightFactory = new FlyweightFactory<Character>();
        List<Enemy> enemies = new ArrayList<Enemy>();
        
        IFlyweight<Character> flyweight = null;
        Character characterFlyweight = null;
        
        Character character = null;
        Enemy enemy = null;
        int hitResistence = 0;
        int damage = 0;
        for (int i = 0; i < 30; i++) {
            if(i < 20){
                character = new Character(1, "Soldier", "elite", "Male");
                hitResistence = 3;
                damage = 20;
            }else if(i < 27){
                character = new Character(2, "Zombie", "earth", "Female");
                hitResistence = 6;
                damage = 30;
            }else if(i < 30){
                character = new Character(1, "Zombie", "swamp", "Male");
                hitResistence = 9;
                damage = 35;
            }
            
            flyweight = flyweightFactory.create(character);
            characterFlyweight = flyweight.getIntrinsic();
            
            enemy = new Enemy(characterFlyweight);
            enemy.setHitResistence(hitResistence);
            enemy.setDamage(damage);
            
            enemies.add(enemy);
        }
        
        System.out.println("\nPrinting Enemies:");
        printList(enemies);
    }
    
    private static void printFlyweights(List<? extends IFlyweight> flyweights){
        for(IFlyweight flyweight : flyweights){
            System.out.println(flyweight.toString());
        }
    }
    
    private static void printList(List list){
        for(Object object : list){
            System.out.println(object.toString());
        }
    }
}
