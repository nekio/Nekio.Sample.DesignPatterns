package nekio.sample.dp.structural.bridge;

/**
 *
 * @author Nekio
 */

public class OperatingSystem {
    private String name;

    public OperatingSystem() {
        this(null);
    }
    
    public OperatingSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" + "name=" + name + '}';
    }
}
