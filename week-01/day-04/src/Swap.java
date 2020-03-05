public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        a = a + b;
        //System.out.println(a);
        b = a - b;
        //System.out.println(b);
        a = a - b;
       // System.out.println(a);

        System.out.println(a);
        System.out.println(b);
    }
}
