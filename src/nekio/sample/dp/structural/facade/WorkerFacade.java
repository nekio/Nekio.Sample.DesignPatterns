package nekio.sample.dp.structural.facade;

/**
 *
 * @author Nekio
 */

import java.util.ArrayList;
import java.util.List;
import nekio.sample.dp.structural.facade.generic.IFacade;

// Facade Class is the entrance to get a well initialized system class
public class WorkerFacade implements IFacade{
    private Group pelothon;
    
    // Method that encapsulates system complexity and create usable objects
    // (pelothon in this case)
    @Override
    public void doWork() {
        pelothon = new Group();
        pelothon.setName("pelothon");
        
        List<Soldier> soldiers = new ArrayList<Soldier>();
        Soldier soldier = null;
        for(int i=0; i < 11; i++){
            soldier = new Soldier("" + i, "Cadet");
            soldiers.add(soldier);            
        }
        
        pelothon.setSoldiers(soldiers);
    }

    public Group getPelothon() {
        return pelothon;
    }
}
