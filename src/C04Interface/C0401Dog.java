package C04Interface;

public class C0401Dog implements C0401AnimalInterface1{
    @Override
    public void makesound() {
        System.out.println("멍멍...왈왈ㄴ어ㅗㅓ엊!");
    }
}

class C0401DogMultiImpl implements C0401AnimalInterface1, C0401AnimalInterface2{

    @Override
    public void makesound() {
        System.out.println("멍멍...왈왈ㄴ어ㅗㅓ엊!");
    }

    @Override
    public String play(String a, String b) {
        return a+"와"+b+"가 산책을 합니다";
    }
}
