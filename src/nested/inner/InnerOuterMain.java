package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner ineer = outer.new Inner();
        ineer.print();

        System.out.println("ineerClass = " + ineer.getClass());
    }
}
