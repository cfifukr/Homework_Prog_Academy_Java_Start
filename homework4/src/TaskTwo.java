public class TaskTwo {
    public static void main(String[] args ){
        char[] array = new char[40];
        for(int i = 0; i< array.length; i++){
            array[i] = (char) ('A' + Math.random() * 26);
            System.out.print(array[i] + " ,");
        }


        System.out.println();
        for(int i = 0; i < array.length; i++){
            array[i] = array[(i + 1) % array.length] ;
            System.out.print(array[i] + " ,");
        }



        System.out.println();
        for(int i = 0; i < array.length; i +=2){
            char c = array[i];
            array[i] = array[(i + 1) % array.length];
            array[(i + 1) % array.length] = c;
        }
        for(char i : array){
            System.out.print(i + " ,");
        }

    }
}
