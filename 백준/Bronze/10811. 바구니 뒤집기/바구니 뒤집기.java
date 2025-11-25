

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int a = 1; a <= N; a++) {
            arr[a-1] = a;
        }
        for (int b = 0; b < M; b++) {
            int i =  sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int v = ((j-i)+1)/2;
            for(int k = 0; k <v ; k++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int a = 0; a < N; a++){
            System.out.print(arr[a] + " ");
        }
    }
}
