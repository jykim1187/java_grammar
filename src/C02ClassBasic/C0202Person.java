package C02ClassBasic;

public class C0202Person {
//  private 접근 제어자는 해당 클래스내에서만 접근이 가능하다
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정-> 그렇게 되면 다른 클래스에내에서 필드 값을 저장할 수 없다. 그래서 아래와 같인 세터메서드를 통해 필드값을 받아 저장
    private String name;
    private int age;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void eating(){
        System.out.println(this.name+"님이 밥을 먹고 있습니다.");
    }



    public String whoIs(){

        String result =  "이름: " + this.name+ " ,이메일: " +this.email + " ,나이:" + this.age;
        return result;

    }


}
