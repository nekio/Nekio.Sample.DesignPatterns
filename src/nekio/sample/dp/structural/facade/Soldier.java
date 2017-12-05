package nekio.sample.dp.structural.facade;

/**
 *
 * @author Nekio
 */

public class Soldier {
    private String name;
    private String range;

    public Soldier(String name, String range) {
        this.name = name;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Soldier{" + "name=" + name + ", range=" + range + '}';
    }
}
