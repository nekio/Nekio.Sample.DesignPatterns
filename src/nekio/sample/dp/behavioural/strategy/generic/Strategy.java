package nekio.sample.dp.behavioural.strategy.generic;

/**
 *
 * @author Nekio
 */

public abstract class Strategy implements IStrategy{
    protected boolean solved;    
    
    protected abstract void start();
    protected abstract boolean isSolution();
    protected abstract void stop();
    
    public boolean isSolved() {
        return solved;
    }
    
    @Override
    public void solve() {
        start();
        if(isSolution()){
            stop();
        }
    }
}
