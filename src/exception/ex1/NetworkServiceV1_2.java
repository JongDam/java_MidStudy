package exception.ex1;


public class NetworkServiceV1_2 {
    public void sendMessagea(String data) {
        String address = "http://exmaple.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가

        String connectResult = client.connect();
        //결과가 성공이아니다 -> 오류
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드 " + connectResult);
            return;
        }


        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 전송오류발생] 오류코드:" + sendResult);
            return;
        }
        client.discoonect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
