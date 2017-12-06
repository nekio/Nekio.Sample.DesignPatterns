package nekio.sample.dp.behavioural.chainofresponsibility;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.chainofresponsibility.generic.Handler;

public class CashHandler extends Handler<Integer> {
    private final int denominator;
    
    public CashHandler(int denominator){
        this.denominator = denominator;
    }
    
    @Override
    public void execute(Integer amount) {
        super.execute(amount);
        
        if(amount >= denominator){
            int qty = amount / denominator;
            int balance = amount % denominator;
            
            System.out.println(qty + " * $" + denominator);
            if(balance != 0){
                if(super.nextInChain != null){
                    super.nextInChain.execute(balance);
                }else{
                    System.out.println("There is no denomination handler for $" + balance);
                }
            }
        }else{
            super.nextInChain.execute(amount);
        }
    }
}
