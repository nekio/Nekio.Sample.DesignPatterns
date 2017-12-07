package nekio.sample.dp.behavioural.strategy;

/**
 *
 * @author Nekio
 */

public class CashPayment extends PaymentStrategy{    
    public CashPayment(double amount){
        super.amount = amount;
    }
    
    @Override
    protected void start() {
        System.out.println("Cash $" + amount);
    }
}
