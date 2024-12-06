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












        }


    }





