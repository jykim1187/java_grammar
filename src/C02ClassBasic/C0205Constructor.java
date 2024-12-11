package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {

        Calendar cal = new Calendar(2024,12,11);
//        데이터의 안정성을 위해 일반적으로 setter를 사용하지 않음
//        cal.setYear(2024);
//        cal.setMonth(12);
//        cal.setDay(11);

        System.out.println(cal.printing());

    }



}
class Calendar{

    private int year;
    private int month;
    private int  day;

    //    생성자는 메서드의 일종으로 클래스명과 동일한 이름으 갖는 메서드
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //    별도의 생성자를 만들경우 기본생성자는 더이상 사용할 수가 없으므로, 기본생성자도 계속해서 사용하고 싶다면, 별도 추가 필요
    public Calendar(){

    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String printing(){
        String result = "오늘은 " + this.getYear() + "연도" + "," + this.getMonth() + "월," + getDay() + "일 입니다.";
        return result;
    }
}

