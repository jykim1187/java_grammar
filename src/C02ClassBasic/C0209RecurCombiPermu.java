package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//        숫자가 1, 2, 3, 4 가 있을 때,
//                List < Integer > myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//    myList로 만들 수 있는 2개짜리 숫자조합을 출력
//    1,2  1,3   1,4   2,3  2,4  3,4

//        List<List<Integer>> answer = new ArrayList<>();
        int index = 0;
//
////        for(int i=0; i<myList.size(); i++){
////            for(int j=i+1; j<myList.size(); j++){
////                List<Integer> temp = new ArrayList<>();
////                temp.add(myList.get(i));
////                temp.add(myList.get(j));
////                answer.add(temp);
////            }
////        }
//        System.out.println(answer);
//        백트래킹
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                answer.add(new ArrayList<>(temp)); //anwer.add(temp)를 하면 안되는 이유?
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(answer);


//       재귀함수 호출을 통한 조합리스트 만들기
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//
//
//        combi(answer,temp,myList,2,0);
//        System.out.println(answer);
////
//        permu(answer, temp, myList, 2, new boolean[myList.size()]);
//        System.out.println(answer);
////    }
    }


////조합
//public static void combi(List<List<Integer>> answer, List<Integer>temp, List<Integer>myList, int count, int index){
//   if(temp.size()==count){
//       answer.add(new ArrayList<>(temp));
//       return;
//   }
//
//    for (int i = index; i < myList.size(); i++) {
//        temp.add(myList.get(i));
//        combi(answer, temp, myList,count,i+1);// 계속 반복들어가는 부분
//        temp.remove(temp.size() - 1);
//    }
//    }


//    //순열
//    public static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited) {
//
//        if (temp.size() == count) {
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i = 0; i < myList.size(); i++) {
//            if (!visited[i]) {
//                visited[i]=true;
//                temp.add(myList.get(i));
//                answer = new ArrayList<>();
//                permu(answer, temp, myList, count, visited);// 계속 반복들어가는 부분
//                temp.remove(temp.size() - 1);
//                visited[i] =false;
//
//            }
//        }
////        n과 m 15649 백준, 로또 6603: 백준
//    }
}
