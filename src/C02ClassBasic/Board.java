package C02ClassBasic;

import java.util.*;

public class Board {
    static Author loginUser;

    public static void main(String[] args) {
        boolean loginSucess = false;
        int id = -1; // 유저 id 로그인 되면 해당 유저의 id값으로 초기화

//           테스트 유저
        Author testUser = new Author("jinyoung", "kim", "1234");
        Author testUser2 = new Author("jinsu", "jin", "1234");

        loop1:
        while (true) {
            System.out.println("로그인은 0번, 회원가입은 1번, 종료를 하려면 그 외의 숫자를 입력하세요");
            Scanner sc = new Scanner(System.in);
            int firstInputButton = sc.nextInt();
//            회원가입

            if (firstInputButton == 1) {
                System.out.println("이름을 입력하세요");
                String inputName = sc.next();
                System.out.println("이메일을 입력하세요");
                String inputEmail = sc.next();
//                인풋이메일이 중복되지 않게!!
                if(Author.loginMap.containsKey(inputEmail)){
                    System.out.println("중복된 이메일입니다. 다시 회원가입을 진행하세요");
                    continue;
                }
                System.out.println("지정하실 비밀번호를 입력하세요");
                String inputPwd = sc.next();
                System.out.println("지정하실 비밀번호 확인을 위해 한번 더 입력하세요");
                String inputPwd2 = sc.next();
                if (!(inputPwd.equals(inputPwd2))) {
                    System.out.println("재확인 비밀번호가 맞지 않습니다. 다시 회원가입을 진행하세요");
                    continue;
                }


                Author user = new Author(inputName, inputEmail, inputPwd);
                System.out.println("회원가입이 완료되었습니다. 로그인해주세요");
                System.out.println("--------------------------------------------------------------------------");
                continue;
            } else if (firstInputButton == 0) {
                //            로그인
                System.out.println("로그인을 위해 이메일을 입력하세요");
                String loginEmail = sc.next();
                System.out.println("비밀번호를 입력하세요");
                String pwd = sc.next();

//                입력한 이메일로 리스트에서 id값을 뽑아내고 로그인 되면 그 아이디가 인덱스니까 객체 불러옴
                if (Author.isLogin(loginEmail, pwd)) {
                    for (Author a : Author.authorList) {
                        if (a.getEmail().equals(loginEmail)) {
                            id = a.getId();
                            loginSucess = true;
                        }
                    }
                }

            } else {
                System.out.println("종료합니다!");
                break;

            }

            if (loginSucess) {
                Author loginUser = Author.authorList.get(id - 1);

                loop2:
                while (true) {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("회원 전체 목록은 1번, 회원 상세 조회는 2번, 게시글 작성은 3번,게시물 목록조회는 4번," +
                            "게시물 상세조회는 5번을 누르세요. 종료는 6번을 누르세요 ");

                    int secondInputNum = sc.nextInt();

                    loop3:
                    while (true) {
                        switch (secondInputNum) {
                            case 1:
                                Author.checkAllMember();
                                break loop3;
                            case 2:
                                System.out.println("상세 조회할 회원 id값을 입력하세요");
                                int idForCheck = sc.nextInt();
                                Author.detailedCheckMember(idForCheck);
                                break loop3;

                            case 3: //게시글 작성
                                System.out.println("먼저 제목을 입력하세요");
                                String postTitle = sc.next();
                                System.out.println("내용을 입력하세요");
                                String postContent = sc.next();

                                Post p1 = new Post(loginUser, postTitle, postContent);
                                System.out.println("작성 완료되었습니다");
                                break loop3;

                            case 4: //게시물 목록 조회
                                Post.checkPostList();
                                break loop3;

                            case 5: //게시물 상세 조회
                                System.out.println("상세 조회할 게시글의 id를 입력하세요");
                                int inputPostId = sc.nextInt();
                                Post.detailedCheckPost(inputPostId);
                                break loop3;

                            case 6: // 서비스 종료
                                System.out.println("다음에 또 만나요~!");
                                break loop1;
                        }

                    }

                }
            }

        }

    }
}


class Author {
   public static List<Author> authorList = new ArrayList<>();
    public static Map<String, String> loginMap = new HashMap<>();

    //필드선언부
    static int staticId = 0;
    private int id =0;                   //id가 리스트의 인덱스가 되겠네
    private String name;
    private String email;
    private String pwd;

    //    생성자 선언
    public Author(String name, String email, String pwd) {
        staticId++;
        id +=staticId;
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        authorList.add(this);
        loginMap.put(email,pwd);
    }


//    게터메서드 선언

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    //  로그인 메서드
    public static boolean isLogin(String email, String pwd) {

        if (loginMap.containsKey(email)) {
            if (loginMap.get(email).equals(pwd)) {
                System.out.println("로그인 되었습니다.");
                return true;
            } else {
                System.out.println("비밀번호가 틀렸습니다. 비밀번호는 아직은 초보라 찾을 수 없어용~");
                return false;
            }
        } else {
            System.out.println("없는 아이디입니다. 아이디는 아직은 초보라 찾을 수 없어용~");
            return false;
        }
    }

//        회원 전체 목록 메서드 선언
    public static void checkAllMember(){
        StringBuilder sb = new StringBuilder();
        System.out.println("--------------전체 회원 목록------------------");
        for(Author a : authorList){
           sb.append("아이디: ").append(a.id).append(" 이메일: ").append(a.email).append("\n");
        }
        System.out.println(sb);
        System.out.println("--------------------------------------------");
    }

//    회원 상세 조회
    public static void detailedCheckMember(int id){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        StringBuilder sb = new StringBuilder();
//        작성게시글 수 찾아야 한다.
        int countWrittenByAuthor =0;
        for(Author a: authorList){
            if(a.id == id){
                for(Post p : Post.postList){
                    if(p.getWriter().equals(a)){
                        countWrittenByAuthor++;


                    }
                }
                sb.append("아이디: " + a.id).append("\n").append("이메일: "+a.email).append("\n").append("이름: "+a.name).append("\n").append("비밀번호: " +a.pwd).append("\n")
                        .append("작성 게시글 수: ").append(countWrittenByAuthor);
            }

        }
        System.out.println(sb);
        System.out.println("--------------------------------------------------------------------------");
    }


}
//-----------------------포스트 클래스----------------------------------------------------------------------------------------------

class Post{
    public static List<Post> postList = new ArrayList<>();


// 필드 선언
    static int static_postId = 0;
    private int postId =0;
    private Author writer;  // 작성자?
    private String title;
    private String content;

//  생성자 선언 ==게시글 작성
    public Post(Author writer, String title, String content){
        static_postId++;
        postId = static_postId ;
        this.writer =writer;
        this.title = title;
        this.content = content;
        postList.add(this);
    }

//    getter메서드 선언

    public Author getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

//    게시물 목록 조회 메서드
    public static void checkPostList(){
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------게시물 목록--------------------------------------").append("\n");
        for(Post a: postList){
            sb.append("게시물ID: ").append(a.postId).append(" , 게시물 제목 : ").append(a.title);
        }
        sb.append("\n").append("--------------------------------------------------------------------");
        System.out.println(sb);
    }

// 게시글 상세 조회 메서드
    public static void detailedCheckPost(int postId){
        StringBuilder sb = new StringBuilder();
        for(Post a: postList){
            if(a.postId == postId){
                sb.append("게시글 아이디: " + a.postId).append("\n").append("제목: "+a.title).append("\n").append("내용: "+a.content).append("\n")
                        .append("작성자 이메일: ").append(a.writer.getEmail());
            } else{
                sb.append("작성된 게시글이 없습니다.");
            }

        }
        System.out.println(sb);
    }

}


