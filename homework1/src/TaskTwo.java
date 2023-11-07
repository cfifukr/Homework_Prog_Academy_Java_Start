import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {

        int now = 2023;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год рождения");
        int year  = Integer.parseInt(sc.nextLine());



        System.out.println("Ваш возраст - " + (now - year));



    }
}