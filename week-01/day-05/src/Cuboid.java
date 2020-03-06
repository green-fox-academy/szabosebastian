public class Cuboid {
    public static void main(String[] args) {
        int a,b,c,volume,surface;

        a = 3;
        b = 4;
        c = 5;

        surface = 2*(a*b+a*c+b*c);
        volume = a*b*c;

        System.out.println("Cuboid's Volume is: " + volume + " and the Surface area is: " + surface);
    }
}
