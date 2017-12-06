package nekio.sample.dp.behavioural.chainofresponsibility;

/**
 *
 * @author Nekio
 */

import java.util.Random;
import nekio.sample.dp.behavioural.chainofresponsibility.generic.Handler;

public class RandomHandler extends Handler<Integer> {
    private final static Random RANDOM = new Random();
    
    @Override
    public void execute(Integer num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("  Id Handler " + id + " is busy");
            nextInChain.execute(num);
        } else {
            System.out.println("Id Handler " + id + " handled the Request " + num);
        }
    }
}
