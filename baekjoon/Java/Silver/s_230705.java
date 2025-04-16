package Silver;

import java.io.*;
import java.util.*;

public class s_230705 { //'스택 수열 1874번' [실버2] (스택)
    public static void main(String[] args) throws IOException{ 
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int point = 0;
        ArrayList<Integer> stack = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N+1; i++){
            stack.add(i);
        }
        for(int i=0; i<N; i++){
            int answer=sc.nextInt();
            if (stack.get(point)>answer) {
                sb.delete(0,sb.length());
                sb.append("NO\n");
                break;
            }
            else {
                while (stack.get(point) < answer) {
                    sb.append("+\n");
                    point++;
                }
                sb.append("-\n");
                stack.remove(point);
                point--;
            }
        }
        System.out.println(sb);
    }
}
