package Bronze;

import java.util.Scanner;

public class b_230421 {
    public static void main(String[] args){ //'별 찍기 - 7 2444번' [브론즈3] (심화1)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=num-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=(num-i)*2-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main0(String[] args){ //'킹, 퀸, 룩, 비숍, 나이트, 폰 3003번' [브론즈5] (심화1)
        Scanner sc = new Scanner(System.in);
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] find = new int[6];
        for (int i=0; i<6; i++){
            find[i] = sc.nextInt();
            correct[i]=correct[i]-find[i];
        }
        for (int res: correct) {
            System.out.print(res+" ");
        }
    }
    public static void main1(String[] args) { //'팰린드롬인지 확인하기 10988번' [브론즈2] (심화1)
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int flag=1;
        for(int i=0; i<sentence.length()/2; i++){
            if(sentence.charAt(i)!=sentence.charAt(sentence.length()-1-i)) {
                flag=0;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main2(String[] args) { //'단어 공부 1157번' [브론즈1] (심화1)
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        int[] alp = new int[26];
        for(int i=0; i<alp.length; i++) alp[i]=0;
        for(int i=0; i<sen.length(); i++){
            if(sen.charAt(i)>=65&&sen.charAt(i)<91) alp[sen.charAt(i)-65]++;
            else alp[sen.charAt(i)-97]++;
        }
        int max=Integer.MIN_VALUE;
        int result=0;
        boolean flag=false;
        for (int i=0; i<alp.length; i++) {
            if(alp[i]>max) {
                max = alp[i];
                result=i;
            }
        }
        for (int i=0; i<alp.length; i++) {
            if(result!=i&&max==alp[i]) flag=true;
        }
        if(flag) System.out.println("?");
        else System.out.println((char)(result+65));
    }
}
