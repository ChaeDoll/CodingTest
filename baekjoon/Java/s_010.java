//230405 입출력 사칙연산
import java.util.Scanner;

public class s_010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a+"??!");
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a-543);
    }
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
