package nekio.sample.dp.creational;

import java.util.Map;
import nekio.sample.dp.creational.singleton.Logger;
import nekio.sample.dp.creational.singleton.LoggerThreadsafe;
import nekio.sample.dp.creational.singleton.generic.Singleton;
import nekio.sample.dp.creational.singleton.generic.SingletonDictionary;
import nekio.sample.dp.dummy.DummyClass;

/**
 *
 * @author Nekio
 */
public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("Mono-threading Singleton");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();
        
        logger1.print("Reference Variable logger1, object memory address: " + logger1.toString());
        logger2.print("Reference Variable logger2, object memory address: " + logger2.toString());
        logger3.print("Reference Variable logger3, object memory address: " + logger3.toString());
        
        System.out.println("\nGeneric Mono-Threading Single use");
        try {
            DummyClass dummy1 = Singleton.getInstance(DummyClass.class);
            DummyClass dummy2 = Singleton.getInstance(DummyClass.class);
            DummyClass dummy3 = Singleton.getInstance(DummyClass.class);
            
            System.out.println(dummy1.toString());
            System.out.println(dummy2.toString());
            System.out.println(dummy3.toString());
        } catch (Exception e) {}
        
        System.out.println("\nGeneric Mono-Threading Dictionary use");
        try {
            DummyClass dummy4 = SingletonDictionary.getInstance(DummyClass.class);
            DummyClass dummy5 = SingletonDictionary.getInstance(DummyClass.class);
            DummyClass dummy6 = SingletonDictionary.getInstance(DummyClass.class);
            
            System.out.println(dummy4.toString());
            System.out.println(dummy5.toString());
            System.out.println(dummy6.toString());
            
            for(Map.Entry<String, Object> singletonElement : SingletonDictionary.getElements().entrySet()){
                System.out.println(singletonElement.toString());
            }
        } catch (Exception e) {}
        
        System.out.println("\nMulti-threading Singleton");
        ThreadLogger taskA = new ThreadLogger("Task A");
        ThreadLogger taskB = new ThreadLogger("Task B");
        ThreadLogger taskC = new ThreadLogger("Task C");
        ThreadLogger taskD = new ThreadLogger("Task D");
        ThreadLogger taskE = new ThreadLogger("Task E");
        
        taskA.start();
        taskB.start();
        taskC.start();
        taskD.start();
        taskE.start();
    }
}

class ThreadLogger implements Runnable {
    private Thread thread;
    private String threadName;

    ThreadLogger(String name) {
        threadName = name;
        System.out.println("Creating Thread:" + threadName);
    }

    @Override
    public void run() {
        LoggerThreadsafe logger = LoggerThreadsafe.getInstance();
        logger.print("Running Thread: " + threadName + ", object memory address: " + logger.toString());
    }

    public void start() {
        System.out.println("Starting Thread:" + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
