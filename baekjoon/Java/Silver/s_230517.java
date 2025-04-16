package Silver;

import java.util.*;

public class s_230517 { //'균형잡힌세상 4949번' [실버4] (스택)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        boolean flag = false;
        while (true) {
            stack.clear();
            String sentence = sc.nextLine();
            if (sentence.length()==1 && sentence.charAt(0)=='.') break;
            for (int i=0; i<sentence.length(); i++){
                if (sentence.charAt(i)=='(') stack.push(1);
                else if (sentence.charAt(i)=='[') stack.push(0);
                else if (sentence.charAt(i)==')') {
                    if (stack.size()>0&&stack.peek()==1) stack.pop();
                    else {
                        stack.push(2);
                        break;
                    }
                }
                else if (sentence.charAt(i)==']') {
                    if (stack.size()>0&&stack.peek()==0) stack.pop();
                    else {
                        stack.push(2);
                        break;
                    }
                }
            }
            if (stack.size()==0)System.out.println("yes");
            else System.out.println("no");
        }
    }
}
