public class MyMain {
    public static void main(String[] args) {
        char str='他';
        String tmp= singleInt(str);
        System.out.println(tmp);
    }
    public static String singleInt(char str) {
        int result = str;
        return String.valueOf(result);
    }
}
