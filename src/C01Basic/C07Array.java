package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식 1.리터럴방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식 2.배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] =1;
//        intArr2[1] =3;
//        intArr2[2] =5;
//        intArr2[3] =7;
//        System.out.println(intArr2[4]); //0으로 초기화

////         참조자료형의 배열은 기본적으로 null 초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////            아래 코드는 NullPointerException 발생
//        for(int i =0; i<stArr.length; i++){
//            if(stArr[i].equals("hello2")){
//                System.out.println("hello2가 있습니다");
//            }
//        }
////        표현식3
//        int[] intArr3 = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,3,5,7,9});


//        표현식4 :불가 ->배열의 길이가 사정 지정되어야함
//        int[] intArr4 = new int[];
//
//        String[] stArr = new String[5];
//        Arrays.fill(stArr,"hello");
//        System.out.println(Arrays.toString(stArr));

//         85,65,90인 int배열을 선언하고 총합,평균을 구하자
//        int[] scores = {85,65,90};
//        int sum =0;
//        int avg =0;
//
//        for(int a : scores){
//            sum +=a;
//        }
//        avg = sum / scores.length;
//        System.out.println(sum);
//        System.out.println(avg);

//        배열의 최댓값.최솟값
//        int[] arr2 = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i =0; i<arr2.length; i++ ){
//                if(arr2[i]> max){
//                    max = arr2[i];
//                }  if(arr2[i]<min){
//                min = arr2[i];
//        }
//            }
//        System.out.println(max);
//        System.out.println(min);

//        배열의 자리 바꾸기
//            int[] arr = {20,10,30};
//            int temp = arr[0];
//            arr[0] = arr[1];
//            arr[1] = temp;

//            int[] arr2 = {10,20,30,40,50};
//            for(int i =0; i<arr2.length-1; i++){
//                int temp = arr2[i];
//                arr2[i] = arr2[i+1];
//                arr2[i+1] =temp;
//            }
//        System.out.println(Arrays.toString(arr2));
//

//             배열 뒤집기 : 새로운배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] arr2 = new int[arr.length];
//
//        for(int i =0; i<arr.length; i++){
//             arr2[i] = arr[arr.length-1-i];
//            }
//        System.out.println(Arrays.toString(arr2));

//        배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//      선택정렬 알고리즘 구현
//
//        for(int i =0; i<arr.length-1; i++){
//            int min = Integer.MAX_VALUE;
//            int temp;
//            for(int j =i; j<arr.length; j++){
//                if(arr[j]<min){
//                    min=arr[j];
//                    temp =arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(유니코드) 기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
////        내림차순 : 기본형 타입은 Comparator로 처리 불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));

//        String[] fruits2 ={"apple", "applee", "applef","b"};
//        System.out.println(Arrays.toString(fruits2));

//          k번째 수 프로그래머스
//            int[] array={1, 5, 2, 6, 3, 7, 4};
//        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//            int number=0;
//            for(int j=commands[i][0]-1; j<commands[i][1];j++){
//                temp[number] = array[j];
//                number++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//        System.out.println(Arrays.toString(answer));

//        숫자 조합이 합
//        모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 2개의 조합의 합을 출력하라
//        int[] intArr ={10,20,30,40,50,60};
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<intArr.length-1; i++){
//            for(int j=i+1; j<intArr.length; j++){
//                sb.append(intArr[i]+intArr[j]).append(" ");
//            }
//        }
//        System.out.println(sb);
////        배열에 담아서 중복까지제거
//        int[] intArr2 ={10,20,30,40,50,60};
//        int[] arr2 = new int[5+4+3+2+1];
//        int num =0;
//
//        for(int i=0; i<intArr2.length-1; i++){
//            for(int j=i+1; j<intArr2.length; j++){
//                 arr2[num] =intArr2[i]+intArr2[j];
//                 num++;
//            }
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//// 위에는 배열에 담아 오름차순으로 정리까지 한 상태
//        int[] arr3 = new int[arr2.length];
//        int count = 0;
//        for(int i=0; i<arr2.length; i++){
//            if(i==arr2.length-1 || arr2[i] != arr2[i+1]){
//                arr3[count] = arr2[i];
//                count++;
//            }
//        }
//
////        배열의 복사
////        copyOf(배열명,length), copyOfRange(배열명, start, end)
//        int[] answer1 = Arrays.copyOf(arr3,count);
//        int[] answer2 = Arrays.copyOfRange(arr3,0,count);


//        두개 뽑아서 더하기
//        int[] numbers ={2,1,3,4,1};
//        int[] answer2 = new int[numbers.length*numbers.length]; //더한 수들의 조합을 넣기 위해 넉넉잡아 길이를 선정
//        int index =0;
//
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j<numbers.length;j++){
//                answer2[index] = numbers[i]+numbers[j];  //두 수의 합을 다 넣는 것
//                index++; //answer2배열에 인덱스 순서에 맞게  두 수의 합을 넣어야 하므로 answer2의 인덱스를 외부에서 변수로 잡고 for문 한턴 돌때마다 +1처리
//            }
//        }
//
//        int[] answer3 = new int[index]; //answer3에 index길이 만큼 잡아준다
//        for(int i=0; i<index; i++){
//            answer3[i] = answer2[i];
//        }
//        Arrays.sort(answer3); //그러면 두 수의 합 수에 딱 맞는 길이의 배열이 됨
//
//        int[] answer4 = new int[answer3.length]; //중복을 이제 제거하기 위한 작업. 중복이 제거된 배열을 닮을 answer4의 길이를 넉넉하게 잡음
//        int index2 = 0;
//
//        for(int i=0; i<answer3.length;i++){
//            if(i==answer3.length-1 || answer3[i] != answer3[i+1]){ //answer3.length-1을 아래조건에 또는 으로 넣는 이유는 i번째가 i+1번째랑 다를때의 i만 answer4배열에 닮은 건데
//                answer4[index2] = answer3[i]; //i가 제일 마지막 요소에 가면 i+1번쨰 인덱스가 없기때문에 오류가 난다. 따라서 i가 마지막일떄도 answer4배열에 닮기 위해
//                index2++; // 여기서 anwser4 인덱스를 따로 변수로 안잡고 i로 잡으면 answer3에서 i번째와 i+1번째 다를 때도 answer4[i]에 인덱스가 부여되면서 0값을 가지게 됨
//            }
//        }
//        int[]answer = new int[index2]; //길이를 재조정하기 위해 진짜 마지막으로 index2길이의 배열을 선언하면
//        for(int i=0; i<index2; i++){
//            answer[i] = answer4[i]; // 중복이 제거되고 길이가 깔끔한 배열이 만들어짐
//        }
//        System.out.println(Arrays.toString(answer));
//        ---------------------------------------------------------------------------------------------
//              배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int answer =0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                answer =i;
//                break;
//            }
//        }
//        이진검색(binary search)- 이분탐색
//        사전에 오름차순정렬이 되어 있어야 이진검색이 가능하다
//        int[] arr ={1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr,15));

//        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); //배열의 주소가 나오니까 false
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));
//
////        이차원 배열의 선언과 할당
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] =10;
//        arr1[0][1] =20;
//        arr1[0][2] =30;
//        arr1[1][0] =40;
//        arr1[1][1] =50;
//        arr1[1][2] =60;
//
//        int[][] arr2= {{10,20,30}, {40,50,60}};

//        가변배열 선언 후 할당
//           int[][]arr1 =new int[2][];
//           arr1[0] = new int[2];
//           arr1[1] = new int[3];
//           arr1[0][0] = 10;
//           arr1[0][1] = 20;
//           arr1[1][0] = 30;
//           arr1[1][1] = 40;
//           arr1[1][2] = 50;
////        가변배열 리터럴 방식
//            int[][]arr2 ={{10,20},{30,40,50}};

//            [3][4]사이즈의 배열을 선언하고 1~12까지의 숫자값을 각 배열에 순차적으로 할당
//        {1,2,3,4),{5,6,7,8}...

//        int[][] arr = new int[3][4];
//
//        int num =1;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//
//        int[][] arr = new int[3][];
//
//        int num =1;
//        for(int i=0; i<arr.length; i++){
//            arr[i] = new int[4];
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//      행렬의 덧셈
//        int[][] arr1 = {{1,2},{3,4}};
//        int[][] arr2 ={{3,4},{5,6}};
//        int[][] answer= new int[arr1.length][arr1[0].length];
//
//        for(int i=0; i<arr1.length; i++){
//            for(int j=0; j<arr1[i].length; j++){
//                    answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }

        }
    }





