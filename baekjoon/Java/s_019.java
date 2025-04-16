//그리디 알고리즘
import java.util.*;
public class s_019 {
    public static void main(String[] args) { //ATM 230411
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int sum=0;
        int[] waitingTime = new int[person];
        for (int i=0; i<person; i++) {
            waitingTime[i]=sc.nextInt();
        }
        Arrays.sort(waitingTime);
        for (int i=0; i<person; i++){
            sum+=waitingTime[i]*(person-i);
        }
        System.out.println(sum);
    }
    public static void main0(String[] args) { //잃어버린 괄호 230412
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int result;
        if (line.contains("-")) {
            int sum = 0;
            int sub = 0;
            int cut = line.indexOf('-');
            String[] aLine = line.substring(cut+1, line.length()).split("\\+|-"); //begin index'부터', end 이전 index'까지'
            String[] bLine = line.substring(0, cut).split("\\+");
            for (int i=0; i< aLine.length; i++) sub+=Integer.parseInt(aLine[i]);
            for (int i=0; i< bLine.length; i++) sum+=Integer.parseInt(bLine[i]);
            result = sum-sub;
        }
        else {
            int sum = 0;
            String[] cLine = line.split("\\+");
            for (int i=0; i<cLine.length; i++) sum+=Integer.parseInt(cLine[i]);
            result = sum;
        }
        System.out.println(result);
    }
    public static void main1(String[] args) { //회의실배정 230412
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int[][] time = new int[num][2];
        for (int i=0; i<num; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });
        int current = time[0][1];
        for (int i=1; i<num; i++) {
            if (time[i][0]>=current) {
                count++;
                current=time[i][1];
            }
        }
        System.out.println(count);
    }
}
