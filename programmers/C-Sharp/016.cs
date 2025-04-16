//자연수 뒤집어서 배열로 만들기 (230314)
public class Solution {
    public int[] solution(long n) {
        int count = n.ToString().Length;
        string number = n.ToString();
        int[] answer = new int[count];
        for (int i=0; i<count; i++){
            answer[i]=int.Parse(number[count-i-1].ToString());
        }
        return answer;
    }
}