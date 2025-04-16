package Silver;

import java.io.*;
import java.util.*;
public class s_230709 { //'덱 10866번' [실버4] (큐, 덱)
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> llist = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            if (order.equals("push_front")) llist.addFirst(Integer.parseInt(st.nextToken()));
            else if (order.equals("push_back")) llist.addLast(Integer.parseInt(st.nextToken()));
            else if (order.equals("pop_front")) {
                if (llist.size()==0) sb.append("-1\n");
                else {
                    sb.append(llist.get(0)+"\n");
                    llist.remove(0);
                }
            }
            else if (order.equals("pop_back")) {
                if (llist.size()==0) sb.append("-1\n");
                else {
                    sb.append(llist.get(llist.size()-1)+"\n");
                    llist.remove(llist.size()-1);
                }
            }
            else if (order.equals("size")) sb.append(llist.size()+"\n");
            else if (order.equals("empty")) {
                if (llist.size()==0) sb.append("1\n");
                else sb.append("0\n");
            }
            else if (order.equals("front")) {
                if (llist.size()==0) sb.append("-1\n");
                else sb.append(llist.get(0)+"\n");
            }
            else if (order.equals("back")) {
                if (llist.size()==0) sb.append("-1\n");
                else sb.append(llist.get(llist.size()-1)+"\n");
            }
        }
        System.out.println(sb);
    }

    public static void main0(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push_front")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (order.equals("push_back")){
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (order.equals("pop_front")) {
                if (deque.size()==0) sb.append("-1\n");
                else sb.append(deque.removeFirst()+"\n");
            } else if (order.equals("pop_back")) {
                if (deque.size()==0) sb.append("-1\n");
                else sb.append(deque.removeLast()+"\n");
            } else if (order.equals("size")) {
                sb.append(deque.size()+"\n");
            } else if (order.equals("empty")) {
                if (deque.size()==0) sb.append("1\n");
                else sb.append("0\n");
            } else if (order.equals("front")) {
                if (deque.size()==0) sb.append("-1\n");
                else sb.append(deque.getFirst()+"\n");
            } else if (order.equals("back")) {
                if (deque.size()==0) sb.append("-1\n");
                else sb.append(deque.getLast()+"\n");
            }
        }
        System.out.println(sb);
    }
}
