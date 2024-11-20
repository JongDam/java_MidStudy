package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random(1); //seed가  같으면 random의 결과 값이 같다
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean radomBoolean = random.nextBoolean();
        System.out.println("radomBoolean = " + radomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); //0~9까지 출력
        System.out.println("0 ~ 9 : " + randomRange1);

        int radomRange2 = random.nextInt(10) + 1; //1 ~ 10까지 출력
        System.out.println("radomRange2 = " + radomRange2);
    }

}
