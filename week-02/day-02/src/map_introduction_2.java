import java.util.HashMap;
import java.util.Map;

public class map_introduction_2 {
    public static void main(String[] args) {

        HashMap<String, String> mysecondMap = new HashMap<>();

        mysecondMap.put("978-1-60309-452-8","A Letter to Jo");
        mysecondMap.put("978-1-60309-459-7","Lupus");
        mysecondMap.put("978-1-60309-444-3","Red Panda and Moon Bear");
        mysecondMap.put("978-1-60309-461-0","The Lab");

       // String keyOutside,valueOutside;

        for (String key: mysecondMap.keySet()) {
            String value = mysecondMap.get(key);
                System.out.println(value + " (ISBN: " + key + ")");
        }
        System.out.println();

        mysecondMap.remove("978-1-60309-444-3");

     //   if ( mysecondMap.values() = "The Lab");
        //mysecondMap.remove(mysecondMap.values("The Lab"));

        System.out.println(mysecondMap);
    }
}
