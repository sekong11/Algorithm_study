import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String str = sc.next();
            int length = str.length();

            System.out.println("" + str.charAt(0) + str.charAt(length - 1));
        }
    }
}
