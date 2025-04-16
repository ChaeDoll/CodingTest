package Silver;

import java.io.*;
import java.util.*;

public class s_230726 { //'문자열 집합 14425번' [실버3] (집합과 맵)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        int count=0;
        for (int i=0; i<N; i++){
            hashSet.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            if (hashSet.contains(br.readLine())) count++;
        }
        System.out.println(count);
    }
}
