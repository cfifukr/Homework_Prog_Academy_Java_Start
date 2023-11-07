import java.util.Random;

public class TaskOne {
    public static void main(String[] args){
        int[] array = new int[20];
        Random rnd = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ,");
        }
        System.out.println('\n');
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
            System.out.print(array[i] + " ," );
        }

    }
}
