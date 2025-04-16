package Bronze;
import java.io.*;
public class b_230719 { //'팩토리얼 2 27433번' [브론즈5] (재귀)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = fact(N);
        System.out.println(result);
    }
    public static long fact(int N){
        if (N==0) {
            return 1;
        }
        return fact(N-1)*N;
    }
}
