package exception.ex2;


public class NetworkServiceV2_3 {
    public void sendMessagea(String data){
        String address = "http://exmaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가
        try {
            client.connect();
            client.send(data);
            client.discoonect();
        } catch (NeteworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() +", 메시지: " + e.getMessage());
        }
    }
}