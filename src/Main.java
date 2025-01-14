import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] temp = br.readLine().split(" ");
            if(temp[0].equals("0"))break;
            int[] arr = new int[temp.length-1];
            for(int i=1; i<temp.length; i++){
                arr[i-1] = Integer.parseInt(temp[i]);
            }
            combi(arr, 0, 0, new int[6]);
            System.out.println();
        }
    }
    public static void combi(int[]arr, int depth, int start, int[] answer){
        if(depth==6){
            StringBuilder sb = new StringBuilder();
            for(int a : answer){
                sb.append(a);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
            return;
        }
        for(int i=start; i<arr.length; i++){
            answer[depth] = arr[i];
            combi(arr, depth+1, i+1, answer);
        }
    }

}