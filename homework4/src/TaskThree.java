public class TaskThree {
    public static void main(String[] args){
        int[][] array = new int[5][10];
        int value = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                value = i + j * array.length;
                array[i][j] = value;

            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
