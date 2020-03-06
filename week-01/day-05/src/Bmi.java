public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double heighInCm = heightInM*100;

        System.out.println("Your BMI: " + (massInKg/(heighInCm*heighInCm))*10000);
    }
}
