package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904DbWebserver {
    public static void main(String[] args) throws IOException, SQLException {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        while (true) {
//            accept는 사용자의 연결 요청을 수락하는 코드다
//            socket 객체 안에는 사용자의 정보(ip 등)가 들어있다.
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n0")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if (infos.contains("?")) {
                id = infos.split("=")[1];


                String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
                String userName = "root";
                String password = "1234";

                Connection connection = DriverManager.getConnection(url, userName, password);
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery("select*from post where id=" + id);

                int idValue = 0;
                String titleValue = "";
                String contensValue = "";

                while (rs.next()) {
                    idValue = rs.getInt("id");
                    titleValue = rs.getString("title");
                    contensValue = rs.getString("contents");
                }

//            사용자에게 응답을 줄 메시지를 http프로토콜에 맞게 세팅
                String reponse = "HTTP/1.1 200 OKay\r\n\r\n" + " id: " + idValue + " title: " + titleValue + " contents: " + contensValue;
//            사용자에게 메시지 응답
                socket.getOutputStream().write(reponse.getBytes(StandardCharsets.UTF_8));
//            플러시란 일반적으로 변경사항을 확정하는 것을 의미
                socket.getOutputStream().flush();
                socket.close();

            }
        }
    }
}
