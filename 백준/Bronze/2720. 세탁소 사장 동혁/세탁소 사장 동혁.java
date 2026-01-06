import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int c =  sc.nextInt();
            sb.append(c / 25).append(" ");
            c = c % 25;
            sb.append(c / 10).append(" ");
            c = c % 10;
            sb.append(c / 5).append(" ");
            c = c % 5;
            sb.append(c);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
