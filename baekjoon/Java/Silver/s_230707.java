package Silver;

import java.io.*;
import java.util.*;
public class s_230707 { //'카드2 2164번' [실버4] (큐, 덱)
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> llist = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) llist.addLast(i+1);
        while(llist.size()>1){
            llist.removeFirst();
            llist.addLast(llist.pop());
        }
        System.out.println(llist.get(0));
    }
}