package Silver;
import java.io.*;
import java.util.*;
public class s_230715 { //'수 찾기 1920번' [실버4] (이분탐색)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> nlist = new HashSet<>();
        //시간초과 일반배열, ArrayList, 우선순위큐(heap) 모두 시간초과해서 해쉬 사용함
        for (int i = 0; i < N; i++) nlist.add(Integer.parseInt(st.nextToken()));

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            if (nlist.contains(Integer.parseInt(st.nextToken()))) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb);
    }
}



