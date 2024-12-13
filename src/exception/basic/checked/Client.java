package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedExcepiton{
        //문제 상황
        throw new MyCheckedExcepiton("ex");
    }
}
