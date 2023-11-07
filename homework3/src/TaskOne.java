import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value(integer)");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 7 ==0){
            System.out.println("Can be divided by 3 and 7");
        } else if (num % 3 == 0 ){
            System.out.println("Can be divided only by 3");
        }else if (num % 7 == 0 ){
            System.out.println("Can be divided only by 7");
        }else{
            System.out.println("Can NOT be divided by 3 or 7");
        }
    }
}
