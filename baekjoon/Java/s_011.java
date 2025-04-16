//230406 - 조건문
import java.util.Scanner;
public class s_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2) System.out.println('>');
        else if (num1<num2) System.out.println('<');
        else System.out.println("==");
    }
    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score>=90) System.out.println('A');
        else if (score>=80) System.out.println('B');
        else if (score>=70) System.out.println('C');
        else if (score>=60) System.out.println('D');
        else System.out.println('F');
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0) System.out.println(1);
        else System.out.println(0);
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if (x>=0&&y>=0) System.out.println(1);
        else if (x<0&&y>=0) System.out.println(2);
        else if (x<0&&y<0) System.out.println(3);
        else System.out.println(4);
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        if (h==0&&m<45) h=24;
        m+=h*60-45;
        h=m/60;
        m%=60;
        System.out.println(h+" "+m);
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int cook = sc.nextInt();
        m+=h*60+cook;
        if (m>=1440) m-=1440;
        h=m/60;
        m%=60;
        System.out.println(h+" "+m);
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a==b&&b==c) System.out.println(10000+a*1000);
        else if (a==b||a==c) System.out.println(1000+a*100);
        else if (b==c) System.out.println(1000+b*100);
        else {
            if (a>b&&a>c) System.out.println(a*100);
            else if (b>a&&b>c) System.out.println(b*100);
            else System.out.println(c*100);
        }
    }
}
