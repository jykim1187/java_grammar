package C04Interface;

public class C0401InterfaceMain {
    public static void main(String[] args) {


//        C0401Cat c1 = new C0401Cat();
//        c1.makesound();
//        C0401Dog  d1 = new C0401Dog();
//        d1.makesound();


//       다형성: 하나의 객체가 여러개의 참조변수 타입을 가질 수 있음을 의미한다
//        C0401AnimalInterface1 c2 = new C0401Cat();
//        c1.makesound();
//        C0401AnimalInterface1  d2 = new C0401Dog();
//        d1.makesound();

//        다중상속(구현)
        C0401AnimalInterface1 c1 = new C0401CatMultiImpl();
        c1.makesound();

        C0401AnimalInterface2 d1 = new C0401DogMultiImpl();
        System.out.println(d1.play("진돗개","시바견"));

//        기본적으로 추상클래스,인터페이스는 객체 생성이 불가능하나,
//        익명객체 방식으로 생성이 가능하다

         C0401AnimalInterface1 ci1 =new C0401AnimalInterface1() {
             @Override
             public void makesound() {
                 System.out.println("hello World");
             }
         };
         ci1.makesound();


    }
}
