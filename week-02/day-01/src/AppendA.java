public class AppendA {
    public static void main(String[] args) {
        String [] append = {"koal", "pand", "zebr"};

            append[0] = "koala";
            append[1] = "panda";
            append[2] = "zebra";

        for (int i = 0; i < append.length; i++) {
            System.out.println(append[i] + " ");
        }
    }
}
