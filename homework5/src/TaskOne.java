public class TaskOne {
    public static int fibonachi(int n){
        if(n == 1 || n == 2) return 1;
        else return fibonachi(n - 1) + fibonachi(n - 2 );
     }



    public static void main(String[] args){
        int[] array = new int[20];

        for(int i = 1; i <= array.length; i++){
            array[i-1] = fibonachi(i);
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ,");
        }


    }
}
