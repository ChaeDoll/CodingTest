import java.util.Scanner;

public class s_001{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int price = sc.nextInt();
        int count = 0;
        int[] value = new int[coin];
        for (int i=0; i<coin; i++) {
            value[i]=sc.nextInt();
        }
        for (int i=0; i<coin; i++){
            while (value[coin-i-1]<=price) {
                count++;
                price -= value[coin-i-1];
            }
        }
        System.out.println(count);
    }
}
