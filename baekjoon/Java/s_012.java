//Loop (230406)
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class s_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1; i<=9; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int result=0;
        for (int i=1; i<=num; i++) result+=i;
        System.out.println(result);
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price=sc.nextInt();
        int n = sc.nextInt();
        int totalPrice=0;
        for (int i=0; i<n; i++) {
            int itemAmount = sc.nextInt();
            int itemPrice = sc.nextInt();
            totalPrice+=itemAmount*itemPrice;
        }
        if (totalPrice==price) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<(n/4); i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
    public static void main4(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); //br.read()만하면 char이라 parseInt가 안됨
        for (int i=0; i<n; i++){
            String number = br.readLine();
            StringTokenizer st = new StringTokenizer(number);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
        }
        bw.flush();
    }
    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+(a+b));
        }
    }
    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
        }
    }
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag==true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==0&&b==0) flag=false;
            else System.out.println(a+b);
        }
    }
    public static void main9(String[] args) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true) {
                String num12 = br.readLine();
                if (num12 == null) break;
                StringTokenizer st = new StringTokenizer(num12);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write((a + b) + "\n");
                bw.flush();
            }
        } catch (NoSuchElementException e) {}
    }
}
