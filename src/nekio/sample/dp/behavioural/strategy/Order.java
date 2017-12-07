package nekio.sample.dp.behavioural.strategy;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String FORMAT = "%-20s %s";
    
    private double total;
    private double remaining;
    private List cart;
    private List payments;
    
    public Order(){
        this.cart = new ArrayList();
        this.payments = new ArrayList();
    }
    
    public void addItem(Item item){
        cart.add(item);
        
        total += item.getPrice();
        remaining += item.getPrice();
        
        System.out.println(String.format(FORMAT, item.getName(), item.getPrice()));
    }
    
    public boolean makePayment(PaymentStrategy strategyPayment){
        System.out.println("\nCurrent debt: " + this.remaining);
        
        this.remaining -= strategyPayment.amount;
        strategyPayment.debt = this.remaining;
        
        
        payments.add(strategyPayment);
        strategyPayment.solve();
        
        return strategyPayment.isSolved();
    }

    public double getTotal() {
        return total;
    }

    public double getRemaining() {
        return remaining;
    }
}
