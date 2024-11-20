package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이", 2);
        Dog dog2 = new Dog("멍멍이", 5);

        System.out.println("1.단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내분에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        //toString를 Overring으로 재정의후 참조값을 알고싶을때
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue: " + refValue);
    }
}
