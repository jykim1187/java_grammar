package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();
//        st4는 public변수니가 접근가능
        System.out.println(p1.st4);
//       st3는 protected변수니까 같은 패키지 내에서 당연히 접근 가능.
        System.out.println(p1.st3);
//        st2는 default니 같은 패키지 내에서 당연히 접근 가능.
        System.out.println(p1.st2);
//        st1은 private변수니 같은 클래스내에서만 접근가능하여 여기 클래스에서는 불가하다.
//        System.out.println(p1.st1);
    }
}
