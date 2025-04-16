package Silver;

import java.io.*;
import java.util.*;
public class s_230712 { //'회전하는 큐 1021번' [실버3] (큐, 덱)
    public static int count = 0;
    public static LinkedList movingLeft(LinkedList deque){
        count++;
        deque.addLast(deque.pop());
        return deque;
    }
    public static LinkedList movingRight(LinkedList deque){
        count++;
        deque.addFirst(deque.getLast());
        deque.removeLast();
        return deque;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i=0; i<N; i++) deque.add(i); //deque 초기화
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++){
            int index = Integer.parseInt(st.nextToken())-1;
            if (deque.indexOf(index) <= deque.size()/2) {
                int valueIndex = deque.indexOf(index);
                for (int j=0; j<valueIndex; j++) movingLeft(deque);
                deque.removeFirst();
            }
            else {
                int valueIndex = deque.size()-deque.indexOf(index);
                for (int j=0; j<valueIndex; j++) movingRight(deque);
                deque.removeFirst();
            }
        }
        System.out.println(count);
    }
}
