package nekio.sample.dp.behavioural;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.behavioural.strategy.CardPayment;
import nekio.sample.dp.behavioural.strategy.CashPayment;
import nekio.sample.dp.behavioural.strategy.Item;
import nekio.sample.dp.behavioural.strategy.Order;
import nekio.sample.dp.behavioural.strategy.PaymentStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Burger", 39.99));
        order.addItem(new Item("Fries", 24.99));
        order.addItem(new Item("Soda", 19.99));
        order.addItem(new Item("Icecream", 11.99));
        order.addItem(new Item("Surprise Toy", 29.99));
        
        List<PaymentStrategy> payments = new ArrayList<PaymentStrategy>();
        payments.add(new CardPayment(60, "Credit", "Mastercard"));
        payments.add(new CardPayment(50, "Debit", "Visa"));
        payments.add(new CashPayment(17));
        
        boolean paySolved = false;
        for(PaymentStrategy payment : payments){
            paySolved = order.makePayment(payment);
            
            if(paySolved){
                System.out.println("Pay Solved");
            }else{
                System.out.println("Order Balaance. Total: " + order.getTotal() + ", Remaining: " + order.getRemaining());
            }
        }
    }
}
