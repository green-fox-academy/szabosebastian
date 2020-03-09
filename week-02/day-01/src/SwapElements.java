import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {

        String [] swap = {"first", "second", "third"};

        String temporary = "";

        temporary = swap[0];
        swap[0] = swap[2];
        swap[2] = temporary;

        System.out.println(Arrays.toString(swap));

    }
}
