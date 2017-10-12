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

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory<Point> factory = new FlyweightFactory<Point>();
        
        List<Point> diagonalLeft = new ArrayList<Point>();
        List<Point> diagonalRight = new ArrayList<Point>();
        List<Point> verticalLine = new ArrayList<Point>();
        List<Point> horizontalLine = new ArrayList<Point>();
        
        IFlyweight fly = factory.create(new Point(1,1));
        Point point = (Point)fly.getIntrinsic();
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
    
    private static void printFlyweights(List<? extends IFlyweight> flyweights){
        for(IFlyweight flyweight : flyweights){
            System.out.println(flyweight.toString());
        }
    }
}
