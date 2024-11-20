package lang.object.tostring.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); //참조값 다름
        System.out.println("equality = " + (user1.equals(user2))); //오버라이드를 통해 equals를 재정의 하고 논리적 물리적 모델을 동등비교
    }

}
