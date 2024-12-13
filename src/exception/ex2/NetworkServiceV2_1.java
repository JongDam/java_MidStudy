package exception.ex2;


import exception.ex1.NetworkClientV1;

public class NetworkServiceV2_1 {
    public void sendMessagea(String data) throws NeteworkClientExceptionV2 {
        String address = "http://exmaple.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가
        client.connect();
        client.send(data);
        client.discoonect();
    }
}
