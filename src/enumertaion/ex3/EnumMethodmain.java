package enumertaion.ex3;

import java.util.Arrays;

public class EnumMethodmain {
    public static void main(String[] args) {
        //모든 ENUM반환
        Grade[] values = Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자면IllegalArgumentException발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString() 오버라이딩이라서 노란줄 그임
    }
}
