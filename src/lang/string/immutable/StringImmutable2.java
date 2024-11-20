package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str = " + str1);
        System.out.println("str = " + str2);
        //String은 불변객체이므로 단순히 더한다고 해결되는것이아니라 항상 새로운 변수(String은 문자열이라 객체가 맞지면 알아보기 쉽게 변수라고함)를 만들어서 저자해야함



    }
}
