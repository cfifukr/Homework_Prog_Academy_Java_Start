public class TaskThree {
    public static int getLowestNumber(int ... numbers){
        int result = numbers[0];
        for(int i: numbers){
            if(i < result) result = i;
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(getLowestNumber(435,435,7657,56,65,324,76,435,324,564,234,675,32,6376));
    }
}
