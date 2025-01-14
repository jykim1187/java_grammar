package C05AnonimousLamda;

import java.util.*;

public class C0503ComparableComparataor {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스 대표적으로 2개를 제공
//        Comparable 인터페이스는 compareTo메서드 선언
//        Comparator 인터페이스는 compare메서드 선언

//        String 클래스에 compareTo메서드 내장
//        String 클래스 외에 java의 많은 클래스에서 compareTo를 구현하고 있다(Comparable인터페이스 구현)
//        String a = "hello";
//        String b = "world";
//
////        두 문자열의 각 자리를 순차적으로 비교. 비교결과는 유니코드 값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder()); // 매개변수가 Comparator인터페이스를 구현받은 거다?

//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("kim",24));
//        myList.add(new Student("lee",21));
//        myList.add(new Student("park",35));
//        myList.add(new Student("choi",15));
//        myList.add(new Student("kim",30));
//        myList.add(new Student("choi",10));
////        방법1.Student 클래스에서 Comparable을 구현한 방식
//        방법2. Comparator를 구현한 익명객체를 sort에 매개변수로 주입
//        myList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o1.getAge()-o2.getAge(); //나이를 기준으로 오름차순 정렬
////                return o2.getAge()-o1.getAge(); //나이를 기준으로 내림차순 정렬
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(myList);

//        람다함수 활용하여 myList정렬 : 이름을 기준으로 내림차순. 이름 같으면 나이로 오름차순
//        myList.sort((a, b)->{
//            if(b.getName().compareTo(a.getName())==0){
//                return a.getAge()-b.getAge();
//            }
//            return b.getName().compareTo(a.getName());
//        });
//        System.out.println(myList);



// myList 요소인 Student 클래스 안에 Comparable 인터페이스를 구현한 compareTo메서드가 있어야 한다.
//        Collections.sort(myList);
//        System.out.println(myList);
//        myList.sort(

//        String[] stArr = {"hello","java","C++","world2"};
//        Arrays.sort(stArr,Comparator.reverseOrder());
//        System.out.println(Arrays.toString(stArr));

//        글자길이를 기준으로 내림차순으로 정렬해라
//        Arrays.sort(stArr,(a,b)->{
//           return b.length()-a.length();
//        });
//        System.out.println(Arrays.toString(stArr));
//
//        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
//
//        for(String a: stArr){
//            pq.add(a);
//        }
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        List <int[]> myList = new ArrayList<>();

        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});
//        정렬 조건: 리스트 안의 배열에 인덱스 1번째 값을 기준으로 오름차순

        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        for(int[] a : myList){
            System.out.println(Arrays.toString(a));
        }

    }
}

//class Student implements Comparable<Student>{
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //    정렬은 결국 2개의 값을 비교하는 것이므로, A와 B 대상 2개만 있으면 충분하다.
//    두 수(또는 문자)의 비교의 경우 음수,0,양수 세 값중 하나만 return되게 되고, 이를 통해 정렬이 이루어진다.
//    기준이 되는 A(this)가 앞에 있을 땐 오름차순, 뒤에 있으면 내림차순으로 내부적으로 정렬로직이 동작
//
//    @Override
//    public int compareTo(Student o) {
//        return o.getName().compareTo(this.getName());
//    }
//
////    객체 호출시에 자동으로 메모리 주소가 아닌 내용이 출력되게 하려면 toString 메서드를 구현해야한다.
////    자바의 모든 클래스는 조상클래스인 object클래스를 상속하고, 아래의 오버라이드는  object클래스의 toString메서드를 구현한 것
    @Override
    public String toString() {
        return "이름은" + this.name + "나이는 " + this.age;
//
//



    }
}


