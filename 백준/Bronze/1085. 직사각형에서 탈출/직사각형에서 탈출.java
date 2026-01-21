import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = Math.abs(w - x);
        int b = Math.abs(h - y);
        int min = Math.min(Math.min(a, b), Math.min(x, y));

        System.out.println(min);

    }
}