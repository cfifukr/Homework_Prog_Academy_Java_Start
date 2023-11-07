public class TaskThree {
    public static String firstCharsOfStrings(String ... arrayOfStrings){
        StringBuffer result = new StringBuffer();
        for(String i : arrayOfStrings){
            result.append(i.toLowerCase().charAt(0));
        }
        return result.toString();
    }


    public static void main(String[] args){
        System.out.println(firstCharsOfStrings("Vnjwfnwefwf", "l", "asdfsfweefwef","ddjksf kj csj jb"));
    }
}
