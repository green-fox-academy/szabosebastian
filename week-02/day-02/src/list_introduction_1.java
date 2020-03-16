import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class list_introduction_1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("William");
    names.add("John");
    names.add("Amanda");

    for (int i = 0; i < names.size(); i++) {
      //  System.out.println(names.get(i));
      //  System.out.println(i+1 +"." + " " + names.get(i));
    }

    names.remove(1);

    for (int j = names.size() - 1; j >= 0; j--) {
      //  System.out.println(names.get(j));
    }

    names.clear();
    System.out.println(names);
  }
}
