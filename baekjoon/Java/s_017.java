//문자열 230410
import java.io.*;
import java.util.*;
public class s_017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(S.charAt(n-1));
    }
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        char[][] array = new char[5][15];
        //int j=0;
        for (int i=0; i<array.length; i++) {
            st = new StringTokenizer(br.readLine()," ");
          //  while(st.hasMoreTokens()){
            for(int j=0; j<15 ;j++){
                if (st.hasMoreTokens()) {
                    array[i][j] = st.nextToken().charAt(0);
                }
                else break;
                //j++;
            }
        }
    }
    public static void main2(String[] args) { //문자열 길이 출력 230415
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(string.length());
    }
    public static void main3(String[] args) { //문자열 맨앞맨뒤 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String a = sc.nextLine();
            System.out.println(a.charAt(0) +""+ a.charAt(a.length()-1));
        }
    }
    public static void main4(String[] args) { //아스키
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().charAt(0)+0);
    }
    public static void main5(String[] args) { //문자열 숫자들 더하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String array = sc.nextLine();
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum+=array.charAt(i)-'0';
        }
        System.out.println(sum);
    }
    public static void main6(String[] args) { //알파벳 존재?
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i=97; i<=122; i++) {
            if (str.indexOf((char)i)>-1) System.out.print(str.indexOf((char)i)+" ");
            else System.out.print(-1+" ");
        }
    }
    public static void main7(String[] args) { //문자열 반복
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j=0; j<str[1].length(); j++){
                int count = 0;
                while (count!=Integer.parseInt(str[0])) {
                    System.out.print(str[1].charAt(j));
                    count++;
                }
            }
            System.out.println();
        }
    }
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        if (arr[0]=="") System.out.println(arr.length-1);
        else System.out.println(arr.length);
    }
    public static void main9(String[] args) { //공백제외 단어세기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        if (arr.length==0) System.out.println(0);
        else if (Objects.equals(arr[0], "")) System.out.println(arr.length-1);
        else System.out.println(arr.length);
    }
    public static void main10(String[] args) { //상수 뒤집어서 큰거 출력
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        char[] a = new char[3];
        char[] b = new char[3];
        for (int i=0; i<3; i++) {
            a[i]=arr[0].charAt(2-i);
            b[i]=arr[1].charAt(2-i);
        }
        String aNum = new String(a);
        String bNum = new String(b);
        if (Integer.parseInt(aNum)>Integer.parseInt(bNum)) System.out.println(Integer.parseInt(aNum));
        else System.out.println(Integer.parseInt(bNum));
    }
    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int sec=0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i)==' ') sec+=2;
            else if (string.charAt(i)=='A'||string.charAt(i)=='B'||string.charAt(i)=='C') sec+=3;
            else if (string.charAt(i)=='D'||string.charAt(i)=='E'||string.charAt(i)=='F') sec+=4;
            else if (string.charAt(i)=='G'||string.charAt(i)=='H'||string.charAt(i)=='I') sec+=5;
            else if (string.charAt(i)=='J'||string.charAt(i)=='K'||string.charAt(i)=='L') sec+=6;
            else if (string.charAt(i)=='M'||string.charAt(i)=='N'||string.charAt(i)=='O') sec+=7;
            else if (string.charAt(i)=='P'||string.charAt(i)=='Q'||string.charAt(i)=='R'||string.charAt(i)=='S') sec+=8;
            else if (string.charAt(i)=='T'||string.charAt(i)=='U'||string.charAt(i)=='V') sec+=9;
            else if (string.charAt(i)=='W'||string.charAt(i)=='X'||string.charAt(i)=='Y'||string.charAt(i)=='Z') sec+=10;
        }
        System.out.println(sec);
    }
}
