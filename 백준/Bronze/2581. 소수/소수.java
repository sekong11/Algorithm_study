import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean isFirst = false;
        int ans = 0;
        int sum = 0;
        if(M == 1){
            M++;
        }
        for(int i = M; i <= N; i++) {
            boolean isPrimme = true;
            for(int j = 2; j < i ; j++) {
                if(i % j == 0){
                    isPrimme = false;
                    break;
                }
            }
            if(isPrimme) {
                sum += i;
                if(!isFirst){
                    ans = i;
                    isFirst = true;
                }
            }

        }

        if(sum == 0){
            sum = -1;
            System.out.println(sum);
        } else {
            System.out.println(sum);
            System.out.println(ans);
        }

    }
}