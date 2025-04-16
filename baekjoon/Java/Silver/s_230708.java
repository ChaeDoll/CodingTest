package Silver;
import java.io.*;
import java.util.*;
public class s_230708 { //'요세푸스 문제 0 11866번' [실버5] (큐, 덱)
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> llist = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] box = br.readLine().split(" ");
        int N = Integer.parseInt(box[0]);
        int K = Integer.parseInt(box[1]);
        sb.append("<");
        for (int i=0; i<N; i++) llist.addLast(i+1);
        while(llist.size()!=0){
            for (int j=1; j<K; j++){
                llist.addLast(llist.pop());
            }
            if (llist.size()==1) {
                sb.append(llist.get(0));
                llist.pop();
                break;
            }
            sb.append(llist.get(0)+", ");
            llist.pop();
        }
        sb.append(">");
        System.out.println(sb);
    }
}
