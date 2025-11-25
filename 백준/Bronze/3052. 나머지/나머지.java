import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int remain;
        ArrayList<Integer> remainList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            remain = arr[i]%42;
            if(!remainList.contains(remain)) {
                remainList.add(remain);
            }
        }
        System.out.println(remainList.size());
    }
}
