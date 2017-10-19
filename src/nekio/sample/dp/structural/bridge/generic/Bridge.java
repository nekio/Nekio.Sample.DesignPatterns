package nekio.sample.dp.structural.bridge.generic;

/**
 *
 * @author Nekio
 * @param <Inner>
 */

public abstract class Bridge<Inner> implements IBridge<Inner> {
    private Inner inner;
    
    public Bridge(Inner inner){
        this.setInner(inner);
    }

    public Inner getInner() {
        return inner;
    }

    @Override
    public void setInner(Inner inner) {
        this.inner = inner;
    }
}
