import java.util.Scanner; //import the Scanner's class
public class Main {

    public static void main(String[] args) {
        int hour; //hour of the clock
        int minute; //minute of the clock
        int second; //second of the clock
        ClockDisplay clock1; //Current clock
        Scanner input = new Scanner(System.in); // create an object of Scanner's class
        System.out.println("Enter the hour: ");
        hour = input.nextInt();
        System.out.println("Enter the minute: ");
        minute = input.nextInt();
        System.out.println("Enter the second: ");
        second = input.nextInt();
        clock1 = new ClockDisplay(hour, minute, second);
        clock1.timeTick();
        System.out.println(clock1.getTime());
    }
}
