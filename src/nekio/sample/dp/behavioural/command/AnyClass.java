package nekio.sample.dp.behavioural.command;

/**
 *
 * @author Nekio
 */

// A Class that doesn't implement ICommand interface
public class AnyClass {
    public Integer add(Integer number1, Integer number2){
        return number1 + number2;
    }

    @Override
    public String toString() {
        return "AnyClass";
    }
}
