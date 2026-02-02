import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int ai = 0; ai < n; ai++){
            arr[ai] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}