package C01Basic;

import com.sun.jdi.ObjectCollectedException;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        map은 index요소가 없으므로, 순서가 무의미하다.
//        key값은 중복되지 않고, 만약 동일한 key값으로 다른 value를 넣으면 value를 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball","농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 복잡도는 O(1) 아주 빠르다
//        System.out.println(sports.get("baseball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key목옥을 리턴하는 메서드
////        values() : map의 value목옥을 리턴하는 메서드
//        for(String key :sports.keySet()){
//            System.out.println("sport의 key값은" + key);
//            System.out.println("sport의 value값은" + sports.get(key));
//        }
////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
//        //        putIfAbsent = key  값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("baseball","야구");
//        System.out.println(sports);
//
////        getOrDefault : ket가 없으면 default값으러 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println((sports.getOrDefault("pingpong","그런키없음")));
//        System.out.println((sports.getOrDefault("baseball","그런키없음")));
//
////        containsKey : key가 있으면 true 없으면 false반환
//        System.out.println(sports.containsKey(("baseball")));
//        System.out.println(sports.containsKey(("pinhpong")));


// String[] arr ={"농구", "축구", "농구", "야구", "축구"};
//    Map<String, Integer> myMap = new HashMap<>();
//
//    for(String a: arr){
//        if(myMap.containsKey(a)){
//            myMap.put(a,myMap.get(a)+1);
//        }else{
//            myMap.put(a,1);
//        }
//    }
//        System.out.println(myMap);

//    프로그래머스 완주하지 못한 선수
//        String[] participant ={"leo", "kiki", "eden"};
//        String[] completion ={"eden", "kiki"};
//
//        Map<String, Integer> join = new HashMap<>();
//        Map<String, Integer> sucess = new HashMap<>();
//        Map<String, String> fail = new HashMap<>();
//
//        for(String a : participant){
//            join.put(a,1);
//        }
//
//        for(String a: completion){
//            sucess.put(a,1);
//        }
//        for(int i=0; i<participant.length; i++)
//        if(!(sucess.containsKey(participant[i]))){
//            fail.put(participant[i],String.valueOf(i));
//        }
//        System.out.println(fail.keySet());
//
////     프로그래머스 의상 // 서로 다른 옷의 조합수를 리턴 //clothes[i][0]상세
//        String[][] clothes ={{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, Integer> item = new HashMap<>();
//        //각 카테고리의 개수를 구하라   //0번 칼럼이 item 1번 칼럼이 category
//
//        for(int i=0; i<clothes.length; i++){
//                item.put(clothes[i][1],item.getOrDefault(clothes[i][1],0)+1);
////                        item에는 카테고리 가 같으면 +1씩 추가
//        }
//
//        System.out.println(item);
//
//        int answer =1;
//        for(String m: item.keySet()){
//            answer *= (item.get(m)+1);
//        }
//        answer --;
//        System.out.println(answer);

//        LinkedHashMap :  데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for(String l : linkedMap.keySet()){
//            System.out.println("key 값은" + l);
//        }

//        TreeMap :key를 통해 데이터를 정렬

//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for(String l : treeMap.keySet()){
//            System.out.println("key 값은" + l);
//        }


//      Hash맵을 사용해서 key로 정렬

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//
//        List<String> myList = new ArrayList<>();
//        for(String a: myMap.keySet()){
//            myList.add(a);
//        }
//        Collections.sort(myList);
//        for(String l : myList){
//            System.out.println("key 값은" + l);
//            System.out.println("value 값은" +myMap.get(l));
//        }
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1) - myMap.get(o2);
//            }
//        });
//        System.out.println(myList);


//        hashmap출력방법 2가지 : 1.강화된 for문 2.iterator
        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");

//        for(String a: myMap.keySet()){
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        }

        Iterator<String> myIters = myMap.keySet().iterator();
//        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환한다
        System.out.println(myIters.next());
//        hasNext는 iterator안에 그 다음 값이 있는지 없는 지 boolean으로 return
        while(myIters.hasNext()){
            System.out.println(myMap.get(myIters.next()));
        }





    }
}
