package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String addresss;

    public ConnectExceptionV4(String addresss, String message) {
        super(message);
        this.addresss = addresss;
    }

    public String getAddresss() {
        return addresss;
    }
}
