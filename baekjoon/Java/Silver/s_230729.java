package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class s_230729 { //'숫자 카드 2 10816번' [실버4] (집합과 맵)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st.nextToken());
            hashMap.put(key, hashMap.getOrDefault(key, 0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(hashMap.getOrDefault(key, 0)).append(' ');
        }
        System.out.println(sb);
    }
}
