package C03Inheritance;

//extends키워드를 통해 상속을 수행한다
public class C0301Inheritance extends Parents{

    int c =10;
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();

//        변수a 상속
        System.out.println(c1.a);
        System.out.println(c1.c);
//        private변수, 메서드는 자식 클래스에서 사용(접근 불가) : 당연하다. private은 같은 클래스 내에서만 사용할 수 있으니까. 아무리 자식 클래스라 하더라도 다른 클래스니까
//        System.out.println(c1.b);
//        m1메서드 상속
        c1.m1();
        c1.m2();
    }
//    부모 메서드의 재정의 : overriding
//    @override는 overriding을 명시적으로 표현하는 표현식이다. 성능을 위해서 붙여주는 게 더 좋은 것으로 알려져있음.
    @Override
    void m1() {
        System.out.println("자식클래스입니다");
    }


    void m2(){
        System.out.println("클래스 2입니다");
    }
}

class Parents{
    int a =10;
    private int b =20;

    void m1(){
        System.out.println("클래스입니다");
        System.out.println(b);
    }


}