import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] intArr = new int[100][100];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x + 10; j++) {
                for(int e = y; e < y + 10; e++) {
                    intArr[j][e] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(intArr[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}