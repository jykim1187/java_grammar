package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        큐 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 가장 앞의 데이터를 삭제하면서 반환
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
////        myQue에 데이터를 삭제하지는 않고 가장 앞의 데이터를 반환
//        System.out.println(myQue.peek());

//          LinkedList ArrayList 성능비교
//          중간위치에 데이터 add테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//
//        long startTime = System.currentTimeMillis();
//        for(int i =0; i<100000; i++) {
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList삽입속도" + (endTime -startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i =0; i<100000; i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList삽입속도" + (endTime2 -startTime2));
//
////        조회속도 비교
////        LinkedList조회
//        long startTime3 = System.currentTimeMillis();
//            for(int i=0; i<100000; i++){
//                list1.get(i);
//            }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList조회속도" + (endTime3 -startTime3));
//
////          ArrayList조회속도
//        long startTime5 = System.currentTimeMillis();
//        for(int i=0; i<100000; i++){
//            list2.get(i);
//        }
//        long endTime5 = System.currentTimeMillis();
//        System.out.println("ArrayList조회속도" + (endTime5 -startTime5));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//
//        while(!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

//        길이제한큐 :ArrayBlockQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4");
//          큐에 여유공간이 있을때만 add
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

//        우선순위 큐: 데이터를 꺼낼 때 정렬된 데이터 poll
//        전체정렬이 아닌, poll할 때 마다 최소값을 보장
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//        백준 최소 힙을 풀었음

//     최대 힙인 경우
//        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
//        maxPq.add(30);
//        maxPq.add(10);
//        maxPq.add(20);
//        System.out.println(maxPq.poll());

//        프로그래머스 - 더 맵게
//        스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
//                새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
//        가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]
//
//        스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
//                새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
//        가진 음식의 스코빌 지수 = [13, 9, 10, 12]
//
//        모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.

//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k = 7;

//         큐에 넣고 제일 작은 수를 아웃 + 그다음 작은수*2 를 다시 배열에 넣고 배열의 모든 요소가 모두 7이상이면 ok  한번 섞을 때마다  count처리

//           프로그래머스 더맵게 - 틀린문제
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        for(int i=0; i<scoville.length; i++){
//            pq.offer(scoville[i]);
//        }
//
//        int answer =0; //섞은 횟수
//        boolean sucess =false;
//
//        while(!sucess){
//            if(pq.size()<2){
//                break;
//            }
//        int min = pq.poll();
//        int nextMin = pq.poll();
//        int newHot = min + (nextMin *2);
//        pq.add(newHot);
//        answer++;
//
//        for(int a : pq){
//            if(a<k){
//                break;
//            }
//            sucess = true;
//            }
//
//        }
//        System.out.println(answer);

//        stack
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }

//같은 숫자는 싫어
//        int []arr = {1,1,3,3,0,1,1};
//        Stack<Integer> st = new Stack<>();
//        for(int a : arr){
//            if(st.isEmpty()){
//                st.push(a);
//            }else {
//                if(st.peek() != a){
//                    st.push(a);
//                }
//            }
//        }
//        int[] answer = new int[st.size()];
//        for(int i=answer.length-1; i>=0 ;i--){
//            answer[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(answer));

//        Deque : addFirst, addLast, pollFirst, pollLast
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        d1.addFirst(30);
//        System.out.println(d1);
//
//        System.out.println(d1.peekFirst());
//        System.out.println(d1.peekLast());
//        System.out.println(d1.pollLast());
//        System.out.println(d1.pollFirst());

//        올바른 괄호 프로그래머스
        String s="(())()";
        Deque<Character> dq = new ArrayDeque<>();
        Deque<Character> dq2 = new ArrayDeque<>();

//        문자열을 반으로 나누고 오른쪽에 있는 (,)개수와 왼쪽에 있는 (,)개수가 맞아야한다.
//        char[] arr = s.toCharArray();
//        int cnt = 0;
//
//        for (char c: arr){
//            cnt = c=='(' ? cnt+1 : cnt-1;
//            if (cnt < 0) return false;
//        }
//
//        return cnt==0;

    }

    }

