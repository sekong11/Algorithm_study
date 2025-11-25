import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int v = sc.nextInt();
        for(int j = 0; j < N; j++) {
            if(arr[j]==v){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
