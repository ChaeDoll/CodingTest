//브루트포스를 사용한 분해합 구하기(230401)
import java.util.Scanner;

public class s_002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M;
        int flag = 0;
        int mSize = (int)(Math.log10(N)+1);
        for (M=1; M<=N; M++){
            int sum = 0;
            for (int j=0; j<String.valueOf(M).length(); j++) {
                sum+=Character.getNumericValue(String.valueOf(M).charAt(j));
            }
            if (M+sum==N){
                System.out.println(M);
                flag=1;
                break;
            }
        }
        if (flag==0) System.out.println(0);
    }
}
