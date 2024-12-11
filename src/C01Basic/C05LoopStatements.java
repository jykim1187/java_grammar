package C01Basic;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a =0;
//        while (a<10){
//            System.out.println("hello world");
//            a++;
//        }
//
//        2~10까지 출력하는 while문 예제
//        int a =2;
//        while(a<11){
//            System.out.println(a);
//            a++;

//        입력한 숫자의 구구단 단수 출력
//        while (true) {
//            System.out.println("단수를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = 1;
//            while (b < 10) {
//                System.out.println(a + "*" + b + "=" + (a * b));
//                b++;
//            }
//        }

//        도어락 키 예제 무한반복
//        int a =0;
//        while (true) {
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (answer == input) {
//                System.out.println("문이 열렸습니다");
////                break키워드는 가장 가까이에 있는 "반복문"을 종료시킨다
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("5회이상 초과");
//                break;
//            }
//        }



//        do while문 : 무조건 한번은 실행되는 while문
//        int a =100;
//        do {
//            System.out.println(a);
//
//        }
//            while(a<10);

//        for문 : 초기식, 조건식, 증감식이 모두  포함돼 있는 반복문
//
//        for(int a=2; a<11; a++){
//            System.out.println(a);
//        }
//        for문은 사용했던 변수명을 for문이 끝난 이후 다음 라인에서 재선언이 가능

//        1~10중에 홀수만 출력하기
//        for(int i=1 ;  i<11 ; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//            1~20까지 수 중에 짝수를 모두 더한 값
//            int sum=0;
//            for(int i =1; i<21; i++){
//                if(i%2 ==0){
//                    sum+=i;
//                }
//            }
//        System.out.println(sum);
//        두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a < b ? a : b;
//        int result =0;
//        for(int i =1; i<=min; i++){
//            if(a%i ==0 && b%i ==0){
//                result = i;
//            }
//        }
//        System.out.println(result);

//        소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            boolean isPrime = true;
//            for(int i=2; i*i<=n; i++){ // 제곱근까지만 확인하면 된다.
//                if(n%i ==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        System.out.println(isPrime);

//        continue : 반복문의 조건식으로 이동
//        continue 활용하여 홀수만 출력하기
//            for(int i=1; i<11; i++ ){
//                if(i%2 == 0){
//                    continue;
//                }
//                System.out.println(i);
//            }

//        배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        일반 for문으로 배열접근
//        for(int i =0; i<4; i++){
//            System.out.println(arr[i]);
//        }
//        향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고 값에 갯수만큼 반복횟수가 결정
//        for(int a : arr){
//            System.out.println(a);
//        }

//        일반 for문을 통해 arr의 저장된 값 변경
//        for(int i = 0; i<4; i++){
//            arr[i] +=10;
//        }
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 톨해 arr값 변경 시도
//        for(int a: arr){
//            a+=100;
//        }
//        System.out.println(Arrays.toString(arr));

//        1부터 24까지 수 중에서 소수인 수를 출력
//        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num=20;
//        }
////            abc= 30; //if문 중괄호 밖에서는 abc변수의 존재를 모름.
//        System.out.println(num);

//        다중반복문
//        2~9단 출력 + 각 단마다 몇단입니다 출력
//        for(int i =2; i<10; i++){
//            System.out.println("------" + i + "단입니다---------------");
//            for(int j=1; j<10; j++){
//                System.out.println( i +"*" + j + "=" + (i*j));
//            }
//        }

//        라벨문 : 반복문에 이름을 붙이는 것
//        for(int i=0; i<5; i++){
//            for(int j =0; j<5; j++){
//                System.out.println("hello world");
//                if(j==2){
//                    break;
//                }
//            }
//        }

//        int[][] arr = {{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
////        숫자 8을 찾아서 2,1에 있다고 출력
////         숫자 11을 찾되, 가장 먼저 찾아 지는 11의 위치만 출력
//                boolean var = false;
//                loop1:
//                for(int i =0; i<4; i++){
//                    loop2:
//            for(int j =0; j<3; j++){
//                if(arr[i][j] == 11){
//                    System.out.println(i +"," + j);
//                    var = true;
//                    break loop1;
//                }
//            }
//        }
//        100~200까지 수 중에서 가장 작은 소수를 출력

//---------------------------------------------------------------------------------------------------------------------
        loop1:
        for(int i =100 ; i<201; i++){
            boolean isPrime = true;
            loop2:
            for(int j =2; j*j<i; j++){
                if( i%j == 0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                break loop1;
            }
        }

        }
}


