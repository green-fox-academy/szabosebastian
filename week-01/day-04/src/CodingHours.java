public class CodingHours {
    public static void main(String[] args) {
        int hours = 6;
        int workdays = 5;
        int semester_days = 17 * workdays;
        int average_hours = 52;
        float average_work = (float)average_hours/workdays * semester_days;

        System.out.println("Spent with coding in a semester "+ hours*semester_days +" hours.");
        System.out.println("Percentage of the coding ours: " + ((hours*semester_days)/average_work)*100 + "%");
    }
}
