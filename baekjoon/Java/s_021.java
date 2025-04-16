//심화1
import java.util.Scanner;
public class s_021 {
    public static void main1(String[] args){ //바구니 순서 바꾸기기 230421
        Scanner sc = new Scanner(System.in);
        int boxNum = sc.nextInt();
        int cycle = sc.nextInt();
        int[] box = new int[boxNum];
        int[] result = new int[boxNum];
        for(int i=0; i<boxNum; i++) {
            box[i]=i+1;
            result[i]=i+1;
        }
        for (int i=0; i<cycle; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int m = sc.nextInt()-1;
            for (int j=a; j<=b; j++) {
                if (m>b) m=a;
                result[j] = box[m++];
            }
            for (int j=0; j<boxNum; j++) box[j]=result[j];
        }
        for (int print:result) System.out.print(print+" ");
    }
    public static void main4(String[] args) { //평균넘는비율 230421
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int student = sc.nextInt();
            int[] arr = new int[student];
            int sum = 0;
            int good = 0;
            for (int j=0; j<student; j++) {
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            for (int j=0; j<student; j++) {
                if (arr[j]>(float)sum/student) good++;
            }
            System.out.println(String.format("%.3f", (float)good/student*100)+"%");
        }
    }
}
