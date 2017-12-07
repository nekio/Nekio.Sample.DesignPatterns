package nekio.sample.dp.behavioural.strategy;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.behavioural.strategy.generic.Strategy;

public abstract class PaymentStrategy extends Strategy{
    protected double amount;
    protected double debt;
    
    @Override
    protected boolean isSolution() {
        if(this.debt <= 0){
            super.solved = true;
        }
        
        return super.solved;
    }

    @Override
    protected void stop() {
        System.out.println("\nPaymentStrategy.stop()");
    }
}
