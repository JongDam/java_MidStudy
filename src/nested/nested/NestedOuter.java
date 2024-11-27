package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {//static은 인스턴스에 접근할 수 없다
        private int nestedinstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedinstanceValue);
            //바깥 클래스의 인스턴스 멤버에 접근
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접슨 할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
         }

    }
}
