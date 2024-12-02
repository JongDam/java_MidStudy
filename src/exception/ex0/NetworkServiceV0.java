package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessagea(String data) {
        String address = "http://exmaple.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        client.connect();
        client.send(data);
        client.discoonect();
    }
}
