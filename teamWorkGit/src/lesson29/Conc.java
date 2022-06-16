package lesson29;

public class Conc {
    public static String concatStr(String a, String b) {
        return a + " " + b;
    }

    public static int strSize(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(concatStr("my", "car"));
        System.out.println(strSize("my-new-car"));
    }
}
