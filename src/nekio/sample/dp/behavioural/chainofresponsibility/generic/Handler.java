package nekio.sample.dp.behavioural.chainofresponsibility.generic;

/**
 *
 * @author Nekio
 * @param <T>
 */

public abstract class Handler<T> implements IHandler<T>{
    private static int nextId = 1;
    protected int id;    
    protected IHandler nextInChain;    
    
    public Handler(){
        this.id = Handler.nextId++;
    }
    
    @Override
    public void setRootHandler(IHandler handler) {
        if (nextInChain == null) {
            this.nextInChain = handler;
        } else {
            nextInChain.setRootHandler(handler);
        }
    }

    @Override
    public void add(IHandler nextHandler) {
        if (nextInChain == null) {
            nextInChain = nextHandler;
        } else {
            nextInChain.add(nextHandler);
        }
    }

    @Override
    public void execute() {
        System.out.println("Handler.execute()");
    }

    @Override
    public void execute(T t) {
        System.out.println("Handler.execute():" + t.toString());
    }
}
