package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0902Webserver2 {
    public static void main(String[] args) throws IOException {
//       소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념이다.
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        while(true){
//            accept는 사용자의 연결 요청을 수락하는 코드다
//            socket 객체 안에는 사용자의 정보(ip 등)가 들어있다.
            Socket socket =serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while(line != null && !line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n0")[0];
            String infos = firstLine.split(" ")[1];
            String id="";
            if(infos.contains("?")){
                id = infos.split("=")[1];
            }


//            사용자에게 응답을 줄 메시지를 http프로토콜에 맞게 세팅
            String reponse = "HTTP/1.1 200 OKay\r\n\r\n"+"hello world java"+id;
//            사용자에게 메시지 응답
            socket.getOutputStream().write(reponse.getBytes(StandardCharsets.UTF_8));
//            플러시란 일반적으로 변경사항을 확정하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();

        }






    }
}
