package exception.ex2;

public class NeteworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NeteworkClientExceptionV2(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
