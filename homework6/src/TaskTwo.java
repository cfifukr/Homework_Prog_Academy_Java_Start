
public class TaskTwo {
    public static String getText(String str, int ... numbers){
        StringBuffer result = new StringBuffer();

        for(int i: numbers){
            result.append(str.charAt(i-1));
        }

        return result.toString();


    }

    public static void main(String[] args){
        System.out.println(getText("Hello", 1, 4));


    }
}
