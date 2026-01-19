import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = 2;

        boolean flag = true;

        while (flag){
            for(int i=n;i<=N;i++){
                if(N%i==0){
                    System.out.println(i);
                    N = N/i;
                    n = i;
                    break;
                }
            }
            if(N==1){
                flag = false;
            }
        }

    }
}
