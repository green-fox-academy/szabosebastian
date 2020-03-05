public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int WholeDaySec = 24*60*60;


        System.out.println(WholeDaySec-currentSeconds-((60-currentMinutes)*60)-((24-currentHours)*60*60));
    }
}
