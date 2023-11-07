public class TaskTwo {
    public static int sumOfNumbers(int n){
        if (n <= 0) return 0;
        else return n + sumOfNumbers(n-1);
    }

    public static void main(String[] args){
        System.out.println(sumOfNumbers(10));
        System.out.println(sumOfNumbers(100));
    }
}
