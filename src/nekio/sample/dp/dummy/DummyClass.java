package nekio.sample.dp.dummy;

import java.util.Date;

/**
 *
 * @author Nekio
 */

public class DummyClass implements IDummy{
    private int id;
    private String name;
    private Date date;
    
    public DummyClass(){
        this(0, "N/A");
    }
    
    public DummyClass(int id, String name){
        this(id, name, new Date());
    }
    
    public DummyClass(int id, String name, Date date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DummyClass{" + "id=" + id + ", name=" + name + ", date=" + date + "}, memory address: " + super.toString();
    }

    @Override
    public void printDummy() {
        System.out.println(this.toString());
    }
}
