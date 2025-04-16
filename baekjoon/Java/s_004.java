//스택 (230401)
import java.util.Scanner;
import java.util.Stack;

public class s_004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int k = sc.nextInt();
        for (int i=0; i<k; i++) {
            int num = sc.nextInt();
            if (num==0) stack.pop();
            else stack.push(num);
        }
        int sum=0;
        for (int elm : stack) sum+=elm;
        System.out.println(sum);
    }
}
