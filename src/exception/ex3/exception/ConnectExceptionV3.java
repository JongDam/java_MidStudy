package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String addresss;

    public ConnectExceptionV3(String addresss, String message) {
        super(message);
        this.addresss = addresss;
    }

    public String getAddresss() {
        return addresss;
    }
}
