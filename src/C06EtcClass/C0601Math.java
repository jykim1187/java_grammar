package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {

//        Math.rando() : 0.0~1.0사이의 임의의 double형을 반환
//        System.out.println(Math.random());

//        로또 번호 7개 뽑아보기 (0부터 99까지의 임의의 숫자 7개 뽑아보는 걸로)
//        for(int i=0; i<7; i++){
//            int rotto = (int)(Math.random()*100);
//            System.out.println(rotto);
//        }

//        Math.abs() :절댓값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil() : 올림 Math.floor() :내림  Math.round() :  반올림
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

//        min,max
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));

//      Math.pow(a,b) :a의 b제곱
        System.out.println(Math.pow(5,3));

//       Math.sqrt() : 제곱근
        System.out.println(Math.sqrt(25));



    }
}
