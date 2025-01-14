package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest extends C0304ProtectedClass{
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        public변수 접근 가능
//        System.out.println(c1.st4);
////        protected변수 접근 불가능 : 상속관계 없을 경우
//        System.out.println(c1.st3);
////        System.out.println(c1.st2);
////        System.out.println(c1.st1);
//
//        ProtectedTest p1 = new ProtectedTest();
//        System.out.println(p1.st3);
////      상속관계에 있다하더라도 default변수는 접근불가
//        System.out.println(p1.st2);
    }
}
