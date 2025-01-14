package C03Inheritance;
//    class에는 public과 default접근제어자만 존재한다
public class C0304ProtectedClass {

//   변수,메서드에는 4가지 접근제어자가 존재
//   public: 프로젝트 전체에서 접근 가능. 즉, 다른 패키지에서도 접근이 가능하다
//   protected : 패키지를 벗어나더라도 상속관계인경우에는 접근가능
//    default : 패키지 내에서만 접근가능
//    private : 클래스 내에서만 접근 가능

    private String st1 = "hello java1";

    String st2 = "hello java2";

    protected String st3 = "hello java3";

    public String st4 = "hello java4";
}
