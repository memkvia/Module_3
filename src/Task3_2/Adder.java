package Task3_2;

/**
 * Created by Me Mkvia on 27.11.2016.
 */
public class Adder extends Arithmetic {
    public boolean chek(Integer a, Integer b) {
        boolean c = false;
        if (a >= b) {
            c = true;
        }
        return c;
    }
}
