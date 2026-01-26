import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xMax = Math.max(xMax, x);
            xMin = Math.min(xMin, x);
            yMax = Math.max(yMax, y);
            yMin = Math.min(yMin, y);
        }
        
        System.out.println((xMax - xMin) * (yMax - yMin));

    }
}