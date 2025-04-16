package Silver;

import java.util.Scanner;

public class s_230429 { //'알고리즘 수업 - 점근적 표기1 24313번' [실버5] (시간 복잡도)
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int flag=0;
        for (int i=n; i<=100; i++) {
            if (num1*i+num2<=c*i) {}
            else flag=1;
        }
        if (flag==0) System.out.println(1);
        else System.out.println(0);
    }
}
