package nekio.sample.dp.behavioural.strategy;

/**
 *
 * @author Nekio
 */

public class CardPayment extends PaymentStrategy{
    private String cardType;
    private String issuer;
    
    public CardPayment(double amount, String cardType, String issuer){
        super.amount = amount;
        this.cardType = cardType;
        this.issuer = issuer;
    }
    
    @Override
    protected void start() {
        System.out.println(issuer + " " + cardType + " $" + amount);
    }
}
