import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N (integer)");
        double  n = sc.nextInt();
        double res_check = n * (n + 1) * (2*n + 1) / 6;
        double res_for = 0;
        double res_while = 0;

        //for
        for(int i = 1; i <= n; i++){
            res_for += i * i;
        }

        //while
        int j = 0;
        while (j<= n){
            res_while += j * j;
            j++;
        }



        System.out.println("Used FOR - " + res_for +
                "\nUsed WHILE - " + res_while +
                "\nUsed formule - " + res_check );

    }
}
