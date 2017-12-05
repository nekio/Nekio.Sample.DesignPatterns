package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.creational.factory.generic.GenericFactory;
import nekio.sample.dp.creational.factory.generic.IFactory;
import nekio.sample.dp.dummy.DummyClass;
import nekio.sample.dp.structural.composite.CompositeEntity;
import nekio.sample.dp.structural.composite.CompositeUtil;
import nekio.sample.dp.structural.composite.SingleEntity;
import nekio.sample.dp.structural.composite.generic.IEntity;

public class CompositeTest {
    public static void main(String[] args) {
        //testSimple();
        testFactory();
    }
    
    private static void testSimple(){
        System.out.println("Testing Simple Way");
        
        CompositeEntity<DummyClass> box1 = new CompositeEntity(new DummyClass(), 1, "box 1");
        CompositeEntity<DummyClass> box2 = new CompositeEntity(new DummyClass(), 2, "box 2");
        CompositeEntity<DummyClass> box3 = new CompositeEntity(new DummyClass(), 3, "box 3");
        
        SingleEntity<DummyClass> itemA = new SingleEntity(new DummyClass(), 1, "item A");
        SingleEntity<DummyClass> itemB = new SingleEntity(new DummyClass(), 2, "item B");
        SingleEntity<DummyClass> itemC = new SingleEntity(new DummyClass(), 3, "item C");
        SingleEntity<DummyClass> itemD = new SingleEntity(new DummyClass(), 4, "item D");
        SingleEntity<DummyClass> itemE = new SingleEntity(new DummyClass(), 5, "item E");
        SingleEntity<DummyClass> itemF = new SingleEntity(new DummyClass(), 6, "item F");
        
        box1.add(itemA);
        box1.add(itemB);
        
        box2.add(itemC);
        box2.add(itemD);
        box2.add(itemE);
        box2.add(itemF);
        
        box3.add(box1);
        box3.add(box2);
        
        //System.out.println(box3.toString());
        System.out.println(CompositeUtil.formatComposition(box3));
    }
    
    private static void testFactory(){
        System.out.println("\nTesting Factory Way");
        
        try {
            IFactory<IEntity<DummyClass>> compositeFactory = new GenericFactory<IEntity<DummyClass>>(CompositeEntity.class, new DummyClass());
            IFactory<IEntity<DummyClass>> singleFactory = new GenericFactory<IEntity<DummyClass>>(SingleEntity.class, new DummyClass());
            
            compositeFactory.setGenericConstructorParams(true);
            CompositeEntity<DummyClass> box1 = (CompositeEntity<DummyClass>)compositeFactory.create(CompositeEntity.class, new DummyClass(), 1, "box 1");
            CompositeEntity<DummyClass> box2 = (CompositeEntity<DummyClass>)compositeFactory.create(CompositeEntity.class, new DummyClass(), 2, "box 2");
            CompositeEntity<DummyClass> box3 = (CompositeEntity<DummyClass>)compositeFactory.create(CompositeEntity.class, new DummyClass(), 3, "box 3");
            
            singleFactory.setGenericConstructorParams(true);
            SingleEntity<DummyClass> itemA = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 1, "item A");
            SingleEntity<DummyClass> itemB = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 2, "item B");
            SingleEntity<DummyClass> itemC = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 3, "item C");
            SingleEntity<DummyClass> itemD = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 4, "item D");
            SingleEntity<DummyClass> itemE = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 5, "item E");
            SingleEntity<DummyClass> itemF = (SingleEntity<DummyClass>)singleFactory.create(SingleEntity.class, new DummyClass(), 6, "item F");
            
            box1.add(itemA);
            box1.add(itemB);
            
            box2.add(itemC);
            box2.add(itemD);
            box2.add(itemE);
            box2.add(itemF);
            
            box3.add(box1);
            box3.add(box2);
            
            System.out.println(CompositeUtil.formatComposition(box3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
