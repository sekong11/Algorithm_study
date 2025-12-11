
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,1,2,2,2,8};

        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(strs[i]);
            arr2[i] = arr[i] - a;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

