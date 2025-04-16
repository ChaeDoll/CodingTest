package Bronze;

import java.io.*;
import java.util.*;
public class b_230714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (number < 2) count++;
            for (int j=2; j<number; j++){
                if (number % j == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(N-count);
    }
}



