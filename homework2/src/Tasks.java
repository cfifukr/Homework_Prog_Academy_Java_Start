import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println(Integer.parseInt("1010110", 2));
        // Result - 86

        //Q2
        System.out.println(Integer.toBinaryString(15));
        // Result - 1111

        //Q3
        System.out.println(Integer.parseInt("A03D", 16));
        //Result - 41021

        //Q4
        System.out.println(Integer.parseInt("1011", 2) + Integer.parseInt("1101", 2));
        // 1011(2) + 1101(2) = 11000(2) = 24(10)

        //Q5

        String txt="Число ";
        txt +=(sc.nextInt()%3==0?"делится":"не делится")+" на 3 без остачи!";
        System.out.println(txt);

        //Q6
        String res="В вашем числе  ";
        res +=((sc.nextInt()/1000)%10)+" тысячи!";
        System.out.println(res);

    }
}