package Silver;

import java.util.Scanner;

public class s_230421 {
    public static void main(String[] args) { //'크로아티아 알파벳 2941번' [실버5] (심화1)
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='c'&&(i+1)<str.length()) {
                if (str.charAt(i+1)=='='||str.charAt(i+1)=='-') count++;
            }
            if(str.charAt(i)=='d'&&(i+1)<str.length()) {
                if (str.charAt(i+1)=='-') count++;
                if ((i+2)<str.length()) {
                    if (str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') count++;
                }
            }
            if(str.charAt(i)=='l'&&(i+1)<str.length())
                if(str.charAt(i+1)=='j') count++;
            if(str.charAt(i)=='n'&&(i+1)<str.length())
                if(str.charAt(i+1)=='j') count++;
            if(str.charAt(i)=='s'&&(i+1)<str.length())
                if(str.charAt(i+1)=='=') count++;
            if(str.charAt(i)=='z'&&(i+1)<str.length())
                if(str.charAt(i+1)=='=') count++;
        }
        System.out.println(str.length()-count);
    }
    public static void main1(String[] args) { //'그룹 단어 체커 1316번' [실버5] (심화1)
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();
        sc.nextLine();
        for(int n=0; n<num; n++) {
            String str = sc.nextLine();
            int k;
            L1:
            for (int i = 0; i < str.length() - 1; i++) {
                k = i;
                while (str.charAt(k) == str.charAt(k + 1)) {
                    if(k==str.length()-2) {
                        k++;
                        break;
                    }
                    else k++;
                }
                for (int j = k + 1; j < str.length(); j++) {
                    if (str.charAt(k) == str.charAt(j)) {
                        count++;
                        break L1;
                    }
                }
            }
        }
        System.out.println(num-count);
    }
    public static void main2(String[] args) { //'너의 평점은 25206번' [실버5] (심화1)
        Scanner sc = new Scanner(System.in);
        int subject = 20;
        float subjectSum = 0;
        float scoreSum = 0;
        for (int i=0; i<subject; i++){
            String[] sub = sc.nextLine().split(" ");
            if(sub[2].contains("A+")){
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*4.5;
            }
            else if(sub[2].contains("A0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*4.0;
            }
            else if(sub[2].contains("B+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*3.5;
            }
            else if(sub[2].contains("B0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*3.0;
            }
            else if(sub[2].contains("C+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*2.5;
            }
            else if(sub[2].contains("C0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*2.0;
            }
            else if(sub[2].contains("D+")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1])*1.5;
            }
            else if(sub[2].contains("D0")) {
                subjectSum+=Float.parseFloat(sub[1]);
                scoreSum+=Float.parseFloat(sub[1]);
            }
            else if(sub[2].contains("F")) {
                subjectSum+=Float.parseFloat(sub[1]);
            }
            else if(sub[2].contains("P")) {}
        }
        System.out.println(String.format("%.6f", scoreSum/subjectSum));
    }
}
