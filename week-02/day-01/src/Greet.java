public class Greet {
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greetFunction(al));
    }
    public static String greetFunction (String greeting) {
        String great = "Greetings dear, " +greeting;

        return great;
    }
}
