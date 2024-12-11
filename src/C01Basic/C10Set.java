package C01Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet =new HashSet<>();
//        mySet.add("1");
//        mySet.add("3");
//        mySet.add("2");
//        mySet.add("6");
//        mySet.add("0");
//        mySet.add("1");
//        System.out.println(mySet);
////        순서보장x, 중복제거o
////        출력시 인덱스로 접근 불가
//        for(String a :  mySet){
//            System.out.println(a);
//        }

//        폰켓몬-프로그래머스
//        int[] nums ={3,3,3,2,2,4};
//
//        int answer =0;
//        Set<Integer> mon = new HashSet<>();
//        //폰켓몬 의 반을 가져갈 수 있는데 최대한 많은 종류로
//
//        for(int i=0; i<nums.length; i++){
//            mon.add(nums[i]);  //mon = 2,3,4
//        }  //웬만하면 각종류마다 하나씩 가져와야함
//
//        if(mon.size()> nums.length / 2){
//            answer = nums.length /2;
//        } else {
//            answer = mon.size();
//        }


//        LinkedHashset
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(3);
//        System.out.println(linkedSet);
//
//
////        TreeSet
//        Set<Integer> treeSet = new TreeSet<>();linkedSet.add(1);
//
//        treeSet.add(1);
//       treeSet.add(0);
//       treeSet.add(3);
//       treeSet.add(3);
//        System.out.println(treeSet);

//        집합관련함수 : 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("pyhton");
        set1.add("javascript");

        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");

//        set1.retainAll(set2);
//        set1.addAll(set2);
        set1.removeAll(set2);
        System.out.println(set1);


    }
}
