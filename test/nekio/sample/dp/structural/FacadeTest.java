package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.facade.Group;
import nekio.sample.dp.structural.facade.Soldier;
import nekio.sample.dp.structural.facade.WorkerFacade;

public class FacadeTest {
    public static void main(String[] args) {
        WorkerFacade facade = new WorkerFacade();
        facade.doWork();
        
        // Once facade do their initial work, the system classes are well exposed
        Group pelothon = facade.getPelothon();
        for(Soldier soldier : pelothon.getSoldiers()){
            soldier.toString();
        }
    }
}
