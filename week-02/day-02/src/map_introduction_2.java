import java.util.HashMap;
import java.util.Map;

public class map_introduction_2 {
    public static void main(String[] args) {

        HashMap<String, String> mysecondMap = new HashMap<>();

        mysecondMap.put("978-1-60309-452-8","A Letter to Jo");
        mysecondMap.put("978-1-60309-459-7","Lupus");
        mysecondMap.put("978-1-60309-444-3","Red Panda and Moon Bear");
        mysecondMap.put("978-1-60309-461-0","The Lab");

        for (String key: mysecondMap.keySet()) {
            String value = mysecondMap.get(key);
                System.out.println(value + " (ISBN: " + key + ")");
        }
        System.out.println();

        mysecondMap.remove("978-1-60309-444-3");

        String removeValue = "The Lab";

        for (String value: mysecondMap.keySet()) {
            if (removeValue.equals(mysecondMap.get(value))) {
                mysecondMap.remove(value);
            }
        }

        mysecondMap.put("978-1-60309-450-4","They Called Us Enemy");
        mysecondMap.put("978-1-60309-453-5","Why Did We Trust Him?");

        System.out.println(mysecondMap.get("478-0-61159-424-8"));
        System.out.println(mysecondMap.get("978-1-60309-453-5"));

        System.out.println(mysecondMap);
    }
}
