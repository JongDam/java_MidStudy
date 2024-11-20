package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; //x001
        String b = " java"; //x002

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);//문자열은 원래 안더해짐 자바가 특별히 제공하는거 다른언어에서는 안됨
        System.out.println("result2 = " + result2);
    }
}
