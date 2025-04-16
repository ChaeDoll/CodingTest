//짐의 최소개수 구하기 (230404)
import java.util.Scanner;

public class s_007{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int a = 3;
        int b = 5;
        int flag = 0;
        int result = 0;
        for (int i=0; i<=1667; i++) {
            for (int j=0; j<=1000; j++){
                if (a*i+b*j==kg) {
                    result=i+j;
                    flag=1;
                    break;
                }
            }
            if (flag==1) break;
        }
        if (flag==1) System.out.println(result);
        else System.out.println(-1);
    }
}
