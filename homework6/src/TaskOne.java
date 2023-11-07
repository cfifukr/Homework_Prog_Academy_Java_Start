public class TaskOne {
    public static String reverseString(String str){
        StringBuffer result = new StringBuffer();
        for(int i = str.length() -1; i >= 0; i --){
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(reverseString("ABCDEFghijklmonpqrYSjnjnbjkbkbjkjjk"));

    }
}
