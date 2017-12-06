package nekio.sample.dp.behavioural;

import nekio.sample.dp.behavioural.chainofresponsibility.CashHandler;
import nekio.sample.dp.behavioural.chainofresponsibility.RandomHandler;
import nekio.sample.dp.behavioural.chainofresponsibility.generic.IHandler;

/**
 *
 * @author Nekio
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        explicitRoot();
        noExplicitRoot();
    }
    
    private static void explicitRoot(){
        System.out.println("\nHandler with explicit root");
        
        IHandler handler = new RandomHandler();
        handler.add(new RandomHandler());
        handler.add(new RandomHandler());
        handler.add(new RandomHandler());
        handler.setRootHandler(handler);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Request #" + i + ":");
            handler.execute(i);
            System.out.println();
        }
    }
    
    private static void noExplicitRoot(){
        System.out.println("\nHandler with no explicit root");
        
        IHandler handler = new CashHandler(1000);
        handler.add(new CashHandler(500));
        handler.add(new CashHandler(200));
        handler.add(new CashHandler(100));
        handler.add(new CashHandler(50));
        handler.add(new CashHandler(20));
        handler.add(new CashHandler(10));
        
        int amount = 1381;
        handler.execute(amount);
    }
}
