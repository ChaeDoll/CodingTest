package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class s_230731 { //'대칭 차집합 1269번' [실버4] (집합과 맵)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<Integer> hashMap = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            hashMap.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++){
            int key = Integer.parseInt(st.nextToken());
            if (hashMap.contains(key)) {
                hashMap.remove(key);
            }
            else hashMap.add(key);
        }
        System.out.println(hashMap.size());
    }
}
