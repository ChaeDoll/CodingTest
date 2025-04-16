package Silver;

import java.io.*;
import java.util.*;

public class s_230713 { //'수 정렬하기 2 2751번' [실버5] (정렬)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int tried = Integer.parseInt(br.readLine());
        for(int i=0; i<tried; i++) {
            heap.add(Integer.parseInt(br.readLine()));
        }
        for(int i=0; i<tried; i++) {
            sb.append(heap.poll()+"\n");
        }
        System.out.println(sb);
    }
}
