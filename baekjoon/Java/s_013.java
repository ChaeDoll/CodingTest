//1차원 배열
import java.util.*;;
public class s_013 {
    //새로운 점수로 평균구하기 (230406)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int total = 0;
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            total += arr[i];
            if (arr[i]>max) max = arr[i];
        }
        System.out.println(((float)total/max)*100/n);
    }

    //바구니 섞기 (230406)
    public static void main0(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] arr = new int[amount];
        int[] revArr = new int[amount];
        for (int i=0; i<amount; i++) {
            arr[i]=i+1;
        }
        int mixCount = sc.nextInt();
        for (int i=0; i<mixCount; i++) {
            int s = sc.nextInt();
            int f = sc.nextInt();
            for (int k=0; k<f-s+1; k++){
                revArr[k]=arr[f-1-k];
            }
            for (int k=0; k<f-s+1; k++){
                arr[s-1+k]=revArr[k];
            }
        }
        for (int i=0; i<amount; i++) System.out.print(arr[i]+" ");
    }

    //나머지 개수 (230406)
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<10; i++){
            hashSet.add(sc.nextInt()%42);
        }
        System.out.println(hashSet.size());
    }

    //바구니 바꾸기 (230406)
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] arr = new int[amount];
        for (int i=0; i<amount; i++) {
            arr[i]=i+1;
        }
        int space = 0;
        int mixCount = sc.nextInt();
        for (int i=0; i<mixCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            space = arr[a-1];
            arr[a-1]=arr[b-1];
            arr[b-1]=space;
        }
        for (int i=0; i<amount; i++) System.out.print(arr[i]+" ");
    }

    //과제 미제출자 찾기 (230406)
    public static void main3(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[30];
        for (int i=0; i<30; i++) arr[i]=false;
        for (int i=0; i<28; i++) {
            int student = sc.nextInt() - 1;
            arr[student] = true;
        }
        for (int i=0; i<30; i++){
            if (arr[i]==false) System.out.println(i+1);
        }
    }

    //공 넣기 (230406)
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int count = sc.nextInt();
        int[] ballInBasket = new int[basket];
        for (int i=0; i<basket; i++) ballInBasket[i]=0;
        for (int i=0; i<count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            for (int j=a; j<=b; j++){
                ballInBasket[j-1]=k;
            }
        }
        for (int i=0; i<basket; i++) System.out.print(ballInBasket[i]+" ");
    }

    //최대값 찾기 (230406)
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;
        for (int i=0; i<9; i++) {
            arr[i]= sc.nextInt();
            if (arr[i]>max) {
                max=arr[i];
                maxIndex=i+1;
            }
        }
        System.out.println(max+"\n"+maxIndex);
    }

    //최대 최소 찾기 (230406)
    public static void main6(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);
    }

    //x보다 작은수 (230406)
    public static void main7(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            if (a<x) System.out.print(a+" ");
        }
    }

    //개수 세기 (230406)
    public static void main8(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count=0;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for (int i=0; i<n; i++){
            if (arr[i]==find) count++;
        }
        System.out.println(count);
    }
}

