package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(myCalculator.sum(10,20));
////      A부서 매출
////        20원 매출
//        myCalculator.sumAcc(20);
//        System.out.println(myCalculator.total);
////        20원 매출
//        myCalculator.sumAcc(30);
//        System.out.println(myCalculator.total);
////        40원 매출
//        myCalculator.sumAcc(40);
//        System.out.println(myCalculator.total);

//        B부서의 매출
//        10원 매출


//        20원 매출

//   ************************ 객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당******************
//        myCalculatorInsatance m1 = new myCalculatorInsatance();
//        m1.sumAcc(10);
//        m1.sumAcc(20);
//        System.out.println(m1.total);
//        myCalculatorInsatance.total_count++;// 객체가 생성될 때 마다 +해주어 객체가 몇개인지 알 수 있게 함
//
//        myCalculatorInsatance m2 = new myCalculatorInsatance();
//        m2.sumAcc(30);
//        m2.sumAcc(40);
//        System.out.println(m2.total);
//        myCalculatorInsatance.total_count++;


        C0202Person p1 = new C0202Person();
        p1.setName("김진영");
        p1.setEmail("wlsdud@naver");
        p1.setAge(25);
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());
        System.out.println(p1.getName());
        p1.eating();
        System.out.println(p1.whoIs());



    }
}

//class myCalculator{
//   static int total =0;  //메서드에 static을 붙이면 클래스 메서드인 것 처럼 변수도 static이 붙어있으면 클래스변수, 붙어있지 않으면 객체 변수
//
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static void sumAcc(int a){
//       total+=a;
//
//    }
//        }
//
//class myCalculatorInsatance{
//    static int total_count = 0;
//    int total =0;  //메서드에 static을 붙이면 클래스 메서드인 것 처럼 변수도 static이 붙어있으면 클래스변수, 붙어있지 않으면 객체 변수
//
//    void sumAcc(int a){
////      this는 객체 그 자신을 의미
////        예를 들어 m1객체일 경우 m1.total, m2객체일 경우 m2.total
////        일반적으로 매개변수 와 구분짓기 위해 사용해야 함.(생략 가능-매개변수와 이름이 같지 않을 경우)
//        this.total+=a;

//    }
//}