//괄호가 올바른지 아닌지 판단 : 스택사용 (230404)
import java.util.Scanner;
import java.util.Stack;

public class s_006{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num; i++) {
            String line = sc.nextLine();
            for (int j=0; j<line.length(); j++) {
                if (line.charAt(j)=='(') stack.push(1);
                else {
                    if (stack.size()==0) {
                        stack.push(1);
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.size()==0) System.out.println("YES");
            else System.out.println("NO");
            stack.clear();
        }
    }
    //스택 안써도 가능하긴 하다.
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num; i++) {
            String line = sc.nextLine();
            for (int j=0; j<line.length(); j++) {
                if (line.charAt(j)=='(') result+=1;
                else {
                    if (result==0) {
                        result+=1;
                        break;
                    }
                    result-=1;
                }
            }
            if (result==0) System.out.println("YES");
            else System.out.println("NO");
            result=0;
        }
    }
}

