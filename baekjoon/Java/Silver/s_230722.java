package Silver;

import java.io.*;
import java.util.*;
public class s_230722 { //'소드인사이드 1427번' [실버5] (정렬)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] nlist = br.readLine().toCharArray();
        Arrays.sort(nlist);
        for (char N: nlist){
            sb.append(N);
        }
        System.out.println(sb.reverse());
    }
}