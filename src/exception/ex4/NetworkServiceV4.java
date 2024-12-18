package exception.ex4;


import exception.ex4.exception.NetworkClientExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkServiceV4 {
    public void sendMessagea(String data) {
        String address = "http://exmaple.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가
        try {
            client.connect();
            client.send(data);
        } finally {
            client.discoonect();
        }
    }
}
