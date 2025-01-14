package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1부터 10까지 누적합계
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

//        재귀함수로 1~10까지 누적합계
        System.out.println(sumAcc(10));

//      factroial 값 구하기
//        factorial(5)-> 1*2*3*4*5
        System.out.println(factorial(10));


//        피보나치 수열 구현
        System.out.println(Fibo(4));


//    10번째 피보나치 구하기  1,1,2,3,5
// 자기 = 전꺼 +전전꺼
        int[] fi= new int[11];
        fi[1] =1;
        fi[2] =1;
        for (int i = 3; i < 11; i++) {
                fi[i] = fi[i-1]+fi[i-2];
        }

        System.out.println(fi[10]);


    }



    public static int sumAcc(int n){
        if(n==1){
            return 1;
        }
        return n+sumAcc(n-1);

    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
         return n*factorial(n-1);
    }
//피보나치 재귀함수 구현

    public static  int Fibo(int n){
        if(n<=2){
            return 1;
        } return Fibo(n-1)+Fibo(n-2);
    }


}
