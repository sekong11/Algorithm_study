import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if(a == 1) continue;

            boolean isPrimme = true;
            for(int j = 2; j < a ; j++) {
                if(a % j == 0){
                    isPrimme = false;
                    break;
                }
            }
            if(isPrimme) ans++;
        }

        System.out.println(ans);
    }
}
