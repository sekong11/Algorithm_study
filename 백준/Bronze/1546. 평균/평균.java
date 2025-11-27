
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
        }
        double M = -1;
        for (int i = 0; i < N; i++) {
            if (scores[i] > M) {
                M = scores[i];
            }
        }
        double sum = 0;

        for (int j = 0; j < N; j++) {
            sum += (scores[j]/M)*100;
        }
        System.out.println(sum/N);
    }
}
