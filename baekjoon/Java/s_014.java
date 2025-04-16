//백준 1018번, 브루트포스(실버4) : 체스판 칠하기 (230407)
import java.util.*;

public class s_014{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char[][] chess = new char[row][column];
        int errorCount1 = 0;
        int errorCount2 = 0;
        sc.nextLine();
        for (int i=0; i<row; i++){
            String str = sc.nextLine();
            for (int j=0; j<column; j++){
                chess[i][j]=str.charAt(j);
            }
        }
        int R = 0;
        int C = 0;
        int min = 10000000;
        //가장 오류가 적은 8x8크기의 맵을 구하기
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                errorCount1=0;
                errorCount2=0;
                if (i>=0&&j>=0&&(i+7<row)&&(j+7<column)) {
                    R=i;
                    C=j;
                    for (int a=R; a<R+8; a++){
                        for (int b=C; b<C+8; b++){//1번 케이스. 홀수 행과 열은 B여야하고 짝수 행과 열은 W여야한다. 아니면 에러+1
                            if ((a%2==0&&b%2==0&&chess[a][b]=='W')||(a%2==1&&b%2==1&&chess[a][b]=='W')) errorCount1+=1;
                            if ((a%2==0&&b%2==1&&chess[a][b]=='B')||(a%2==1&&b%2==0&&chess[a][b]=='B')) errorCount1+=1;
                        }
                    }
                    if (errorCount1<min) min=errorCount1;
                    for (int a=R; a<R+8; a++){
                        for (int b=C; b<C+8; b++){//2번 케이스. 홀수 행과 열은 W여야하고 짝수 행과 열은 B여야한다. 아니면 에러+1
                            if ((a%2==0&&b%2==0&&chess[a][b]=='B')||(a%2==1&&b%2==1&&chess[a][b]=='B')) errorCount2+=1;
                            if ((a%2==0&&b%2==1&&chess[a][b]=='W')||(a%2==1&&b%2==0&&chess[a][b]=='W')) errorCount2+=1;
                        }
                    }
                    if (errorCount2<min) min=errorCount2;
                }
            }
        }//반복하며 최소한의 min값(수정할 양)을 갖는 경우를 찾는다.
        System.out.println(min);
    }
}
