package C04Interface;

import java.util.LinkedList;
import java.util.Queue;

public class C0402InterfaceMain implements C0402Interface3{

    public static void main(String[] args) {
        C0402Interface3 im = new C0402InterfaceMain();

        im.play("a","b");
        im.makeSound();

//        부모의 부모 인터페이스를 참조변수의 타입으로 사용하는 것이 가능
        C0402Interface1 im2 = new C0402InterfaceMain();
//      interface1에 없는 play메서드는 사용 불가
//        im2.play("a","b");
        im2.makeSound();

        Queue<Integer> myQue = new LinkedList<>();

    }
    @Override
    public String play(String a, String b) {
        return "";
    }

    @Override
    public void makeSound() {

    }
}
