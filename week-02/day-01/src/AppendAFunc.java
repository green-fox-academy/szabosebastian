public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";

        System.out.println(appendAFunc(typo));
    }
    public static String appendAFunc (String append) {
        String adding = append+"a";

        return adding;
    }
}
