package exception.basic.checked;

public class CheckedThrowsMain {
    public static void main(String[] args) throws MyCheckedExcepiton {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
