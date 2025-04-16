package Bronze;

import java.util.Scanner;

public class b_230429 { //'알고리즘 수업4,5,6 24265~24267번' [브론즈3,3,2] (시간 복잡도)
    public static void main(String[] args) { //시간복잡도 4
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*(num-1)/2+"\n"+2);
    }
    public static void main1(String[] args) { //시간복잡도 5
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*num*num+"\n"+3);
    }
    public static void main2(String[] args) { //시간복잡도 6 (정답봄)
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        System.out.println(num*(num-1)*(num-2)/6+"\n"+3);
    }
}
