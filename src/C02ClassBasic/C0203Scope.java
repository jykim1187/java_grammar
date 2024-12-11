package C02ClassBasic;

public class C0203Scope {
//    클래스 변수는 클래스 전역에서 접근이 가능하다
    static int v2 =10;
    public static void main(String[] args) {
//        지역변수의 유효범위
        int v1 =10;
        scope(v1); //int는 기본타입 값으로 스택메모리의 값 자체가
        System.out.println(v1);//v1 =20이 아니라 10이다. v1은 기본타입의 값으로 scope함수에 매개변수로 전달될때 값자체가 복사되어 전달된거기때문

//        객체의 유효범위
        C0202Person p1 = new C0202Person();
        p1.setAge(20);
        scope2(p1); //p1은 객체니까 힙메모리의 주소까지 매개변수로 들어가. scope2매서드내에서 p1의 주소까지 찾아가 age를 30으로 변경시키기 때문에
        System.out.println("메인에서 getAge"+p1.getAge()); //값은 30이다

//        클래스 변수의 유효범위
        System.out.println(v2);





    }
    public static void scope(int a){
        a = 20;
        System.out.println(a);
    }

    public static void scope2(C0202Person person){
        person.setAge(30);
        System.out.println("scope에서 getAge" +person.getAge());
    }
}
