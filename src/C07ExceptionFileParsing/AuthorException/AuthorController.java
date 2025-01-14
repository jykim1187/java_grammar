package C07ExceptionFileParsing.AuthorException;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자의입출력을 받아 처리하는 계층(Controller)
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        boolean isLogin = false;
        while (true) {
//            회원가입 1번 , 2번 로그인
            System.out.println("회원가입 1번, 로그인 2번, 회원 목록조회 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("email 입력해주세요");
                String email = sc.nextLine();
                System.out.println("password 입력해주세요");
                String password = sc.nextLine();
//                email중복방지, password길이 8자리 이상이어야함. 미만이면 예외발생
                try {
                    authorService.register(name, email, password);
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                } catch(NoSuchElementException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            } else if (input.equals("2")) {
                if(isLogin){
                    System.out.println("이미 로그인이 되어있는 상태입니다");
                } else {

                       System.out.println("email 입력해주세요");
                       String email = sc.nextLine();
                       System.out.println("password 입력해주세요");
                       String password = sc.nextLine();
//                email과 password가 맞는지 검증
                    try {
                       isLogin = authorService.login(email, password);
                   }catch(NoSuchElementException e){
                       System.out.println(e.getMessage());
                   } catch(RuntimeException e){
                       System.out.println(e.getMessage());
                   }
                    if (isLogin) {
                        System.out.println("로그인에 성공하였습니다.");
                    }
                }
            } else if (input.equals("3")) {
                if (isLogin) {
                   authorService.findAll();
                } else {
                    System.out.println("로그인이 되지 않았습니다");
                }
            }

        }
    }
}

