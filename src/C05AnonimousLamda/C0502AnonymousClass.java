package C05AnonimousLamda;

public class C0502AnonymousClass {
    public static void main(String[] args) {

//  AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명의 클래스가 만들어짐과 동시에 익명객체가 생성되고 있음
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {
                System.out.println("동물은 소리를 냅니다1");
            }
        };
        a1.makeSound1();
//        Animal의 익명 객체 생성
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound() {
                System.out.println("동물은 소리를 냅니다2");
            }
        };
        a2.makeSound();

//        익명객체에 구현메서드가 1개밖에 없을 때에는 람다표현식(화살표함수)로 표현가능
//        ()부분에 매개변수가 지정 ->뒤에 {}와도 된다.
//        Animal1 a3 = ()-> System.out.println("동물은 소리를 냅니다");

//       실행문이 2줄 이상인경우에는 아래와 같이 {}로 감싸야 함에 유의
        Animal1 a3 = () -> {
            System.out.println("동물은 소리를 냅니다");
            System.out.println("동물은 소리를 냅니다");
            System.out.println("동물은 소리를 냅니다");
        };
        a3.makeSound();

        //    매개변수를 받아 String으로 리턴하는 메서드를 구현한 익명객체 생성
        Animal2 animal2 = (a, b, c) -> {
            return a + " " + b + "  " + c;
        };
//    Animal2의 메서드를 활용해서 hello,world,java를 매개변수로 넣어 리턴되는 값을 출력해보라

        System.out.println(animal2.makeSound("hello","world","java"));


//

        Animal3 animal3 = (a,b,c) -> {
            if(c>=10){
                return a+b;
            }
                return a;

        };
        System.out.println(animal3.makeSound("hello","java",20));




    }



}


abstract class AbstractAnimal{
    abstract void makeSound1();
    
    void makeSound2(){
        
    }
}

interface Animal1{
    void makeSound();
}

interface Animal2{
    String makeSound(String a, String b, String c);
}

interface  Animal3 {
    String makeSound(String a, String b, int c);
}
