package Bronze;

import java.util.*;
public class b_230721 { //'진법 변환2 11005번' [브론즈1] (일반 수학1)
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long B = sc.nextInt();
        change(N, B);
        sb.reverse();
        System.out.println(sb);
    }
    static long change(long N, long B){
        long r;
        if (N<B) {
            if (N>=10){
                char M = (char) (N + 55);
                sb.append(M);
            }
            else sb.append(N);
            return 0;
        }
        else {
            r = N % B;
            if (r>=10){
                char M = (char) (r + 55);
                sb.append(M);
            }
            else sb.append(r);
            return change(N/B, B);
        }
    }
}
