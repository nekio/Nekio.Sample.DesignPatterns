package nekio.sample.dp.structural;

import nekio.sample.dp.creational.factory.GenericFactory;
import nekio.sample.dp.creational.factory.generic.IFactory;
import nekio.sample.dp.structural.composite.CompositeEntity;
import nekio.sample.dp.structural.composite.CompositeUtil;
import nekio.sample.dp.structural.composite.SingleEntity;
import nekio.sample.dp.structural.composite.generic.IEntity;

/**
 *
 * @author Nekio
 */
public class CompositeTest {
    public static void main(String[] args) {
        CompositeEntity box1 = new CompositeEntity(1, "box 1");
        CompositeEntity box2 = new CompositeEntity(2, "box 2");
        CompositeEntity box3 = new CompositeEntity(3, "box 3");
        
        SingleEntity itemA = new SingleEntity(1, "item A");
        SingleEntity itemB = new SingleEntity(2, "item B");
        SingleEntity itemC = new SingleEntity(3, "item C");
        SingleEntity itemD = new SingleEntity(4, "item D");
        SingleEntity itemE = new SingleEntity(5, "item E");
        SingleEntity itemF = new SingleEntity(6, "item F");
        
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
        
        // Using Factory        
        /*try {
            IFactory<IEntity> compositeFactory = new GenericFactory<IEntity>(CompositeEntity.class);
            IFactory<IEntity> singleFactory = new GenericFactory<IEntity>(SingleEntity.class);
            
            CompositeEntity box1 = (CompositeEntity)compositeFactory.create();
            CompositeEntity box2 = (CompositeEntity)compositeFactory.create();
            CompositeEntity box3 = (CompositeEntity)compositeFactory.create();
            
            SingleEntity itemA = (SingleEntity)singleFactory.create();
            SingleEntity itemB = (SingleEntity)singleFactory.create();
            SingleEntity itemC = (SingleEntity)singleFactory.create();
            SingleEntity itemD = (SingleEntity)singleFactory.create();
            SingleEntity itemE = (SingleEntity)singleFactory.create();
            SingleEntity itemF = (SingleEntity)singleFactory.create();
            
            box1.add(itemA);
            box1.add(itemB);
            box2.add(itemC);
            box2.add(itemD);
            box2.add(itemE);
            box2.add(itemF);
            box3.add(box1);
            box3.add(box2);
        } catch (Exception e) {
            System.out.println(e);
        }
        */
    }
}
