//백준 2798번, 브루트포스(브론즈2), 블랙잭 (230407)
import java.util.*;
public class s_016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int limit = sc.nextInt();
        int[] card = new int[num];
        int nearNum=0;
        int sum=0;
        for (int i=0; i<num; i++){
            card[i]=sc.nextInt();
        }
        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                for (int k=0; k<num; k++){
                    if (i!=j&&i!=k&&j!=k) {
                        sum=card[i]+card[j]+card[k];
                        if (sum>nearNum&&sum<=limit) nearNum=sum;
                    }
                }
            }
        }
        System.out.println(nearNum);
    }
}
