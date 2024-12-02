package exception.ex1;


public class NetworkServiceV1_1 {
    public void sendMessagea(String data) {
        String address = "http://exmaple.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가
        client.connect();
        client.send(data);
        client.discoonect();
    }
}
