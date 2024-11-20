package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";//원래는 밑에처럼 객체참조함 메서드 기능중하나임
        String str2 = new String("hello");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " +str2);
    }
}
