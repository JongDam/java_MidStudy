package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessagea(String data) {
        String address = "http://exmaple.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가
        try {
            client.connect();
            client.send(data);
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ",메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지" + e.getMessage());
        } finally {
            client.discoonect();
        }
    }
}
