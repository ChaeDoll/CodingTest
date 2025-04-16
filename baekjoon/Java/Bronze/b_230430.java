package Bronze;

import java.io.*;
import java.util.*;

public class b_230430 {
    public static void main(String[] args) throws IOException { //'진법변환 2745번' [브론즈2] (일반 수학 1)
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] num = st.nextToken().toCharArray();
        int gin = Integer.parseInt(st.nextToken());
        long sum=0;
        for (int i=num.length-1; i>=0; i--) {
            if (num[num.length-1-i]>=65&&num[num.length-1-i]<=90) {
                sum+=(num[num.length-1-i]-55)*Math.pow(gin, i);
            }
            else{
                sum+=(num[num.length-1-i]-'0')*Math.pow(gin, i);
            }
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum=0;
        for(int i=0; i<5; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.println(sum/5);
        Arrays.sort(num, 0, 5);
        System.out.println(num[2]);
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int pass = sc.nextInt();
        int[] num = new int[student];
        for(int i=0; i<student; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[num.length-pass]);
    }
}
