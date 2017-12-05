package nekio.sample.dp.structural.facade;

/**
 *
 * @author Nekio
 */

import java.util.List;

public class Group {
    private String name;
    private List<Soldier> soldiers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }
}
