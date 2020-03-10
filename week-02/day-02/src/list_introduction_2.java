import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class list_introduction_2 {
    public static void main(String[] args) {
        ArrayList<String> List_A = new ArrayList<>();

        List_A.add("Apple");
        List_A.add("Avocado");
        List_A.add("Bluebarries");
        List_A.add("Durian");
        List_A.add("Lychee");

               ArrayList List_B = (ArrayList) List_A.clone();

        ////////////////////////////////////////////////////////

        boolean containItem =List_A.contains("Durian");

        if(containItem){
            System.out.println("Contain");
        } else {
            System.out.println("Not contain");
        }

        ////////////////////////////////////////////////////////

        List_B.remove("Durian");

        ////////////////////////////////////////////////////////

        List_A.add(4, "Kiwifruit");

        ////////////////////////////////////////////////////////

        if (List_A.size() == List_B.size()) {
            System.out.println("The two list is equal");
        } else {
            System.out.println("The two list is NOT equal");
        }

        ////////////////////////////////////////////////////////

        System.out.println(List_A.indexOf("Avocado"));
        System.out.println(List_B.indexOf("Durian"));

        ////////////////////////////////////////////////////////

        List_B.addAll(Arrays.asList("Pomelo", "Passion Fruit"));

        ////////////////////////////////////////////////////////

        System.out.println(List_A.get(2));

        ////////////////////////////////////////////////////////
        System.out.println(List_A);
        System.out.println(List_B);
    }
}
