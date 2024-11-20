package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
        //왜 값이 안 바뀔까? String은 불변객체이다 따라서 값이 한번정해지면 바꿀 수 없다
        //나는 str이라는 객체명을 통해 String에 hello라는 값을 정했음 따라서 이 값은 안 바뀜
        //그런데 이 문자열에 java라는 단어를 붙힐려고 String의 메서드 기능은 concat을 사용
        // 이 메서드는 리턴할때 새로운 String객체를 만들어 내므로 기존 str랑은 다름
        //따라서 불변객체의 값을 바꾸고 그 값을 출력하고 싶을때는 새로운 객체를 저장하는 변수? 객체? 가 필요함
        //그러므로 str를출력하는것이 아닌 str2를 만들어 concate으로 한다음 저장하고 str2를 출력하면 가능!
    }
}
