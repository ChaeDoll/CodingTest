//백준 1436번, 브루트포스(실버5), 영화감독 숌 (230407)
import java.util.*;
public class s_015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        Integer title = 0;
        while (count!=num) {
            title++;
            if (title.toString().contains("666")) count++;
        }
        System.out.println(title);
    }
}
