import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int b = sc.nextInt();

        while (n > 0) {
            int r = n % b;
            if (r >= 10) sb.append((char)('A' + (r - 10)));
            else sb.append((char)('0' + r));
            n /= b;
        }

        System.out.println(sb.reverse().toString());
    }
}
