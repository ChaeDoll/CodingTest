package Bronze;

import java.io.*;
import java.util.*;

public class b_230705 { //'평균은 넘겠지 4344번' [브론즈1] (수학)
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int student = Integer.parseInt(st.nextToken());
            int sum = 0;
            int count = 0;
            int[] slist = new int[student];
            for (int j=0; j<student; j++){
                slist[j]=Integer.parseInt(st.nextToken());
                sum+=slist[j];
            }
            for (int j=0; j<student; j++) if(slist[j] > (float)sum/(float)student) count++;
            sb.append(String.format("%.3f",(float)count/(float)student*100)+"%\n");
        }
        System.out.println(sb);
    }
}
