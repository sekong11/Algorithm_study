import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] intarr = new int[9][9];
        int max = -1;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                intarr[i][j] = sc.nextInt();
                if (intarr[i][j] > max) {
                    max = intarr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max+"\n"+row+" "+col);
    }
}
