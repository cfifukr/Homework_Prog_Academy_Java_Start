import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int day = 0;
        while(true){
            System.out.println("Input day number");
            day = sc.nextInt() % 7;

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                case 0:
                    System.out.println("Sunday");
            }
        }
    }
}
