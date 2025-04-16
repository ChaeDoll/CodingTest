package Silver;

import java.util.Scanner;
public class s_230802 { //'구간 합 구하기4 11659번' [실버3] (누적 합)
//BufferedReader사용시 에러. Scanner 사용함
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N+1];
        list[0]=0;
        for (int i=1; i<=N; i++){
            list[i]=list[i-1]+sc.nextInt();
        }
        for (int i=0; i<M; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(list[m]-list[n-1]);
        }
    }
}
