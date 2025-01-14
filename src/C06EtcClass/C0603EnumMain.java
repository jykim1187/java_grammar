package C06EtcClass;

public class C0603EnumMain {
    public static void main(String[] args) {
//        일반문자열로 classGrade를 세팅
//    EnumStudent e1 = new EnumStudent("hong1","firstgrade");
//
////    class를 별도로 생성해서, static final변수를 가져다 쓰는 방법
//        EnumStudent e2 = new EnumStudent("hong1",ClassGrade.c1);
//        EnumStudent e3 = new EnumStudent("hong1",ClassGrade.c2);
//        EnumStudent e4 = new EnumStudent("hong1","1stgrade");
//
//      Enum클래스를 활용한 classGrade 세팅
//        Enum클래스에 변수값을 세팅하도록 강제함으로써, 특정변수값에 종류를 제한시킬 수 있다
        EnumStudent e1 = new EnumStudent("hong1",ClassGrade.FIRST_GRADE);
//        EnumStudent e2 = new EnumStudent("hong2","firstGrade");//타입불일치
        System.out.println(e1.getClassGrade());
        System.out.println(e1.getClassGrade().getClass());
//      enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당된다
        System.out.println(e1.getClassGrade().ordinal());

    }
}

enum ClassGrade{
//    각각의 상수값들의 타입은 ClassGrade라는 점에서 static final String과의 차이점이 있다
    FIRST_GRADE, SECOND_GRADE, THIRD_GRADE;
    private ClassGrade classGrade;
}

class EnumStudent{
    private String name;
    private ClassGrade classGrade;

    public EnumStudent(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }
}