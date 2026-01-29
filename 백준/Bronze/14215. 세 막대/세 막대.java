import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int ans = 0;
        
        if(Math.max(a,Math.max(b,c)) == a){
            if(b + c > a){
                ans = a + b + c;
            } else {
                ans = 2*(b + c)-1;
            }
        } else if (Math.max(a,Math.max(b,c)) == b){
            if(a + c > b){
                ans = a + b + c;
            } else {
                ans = 2*(a + c)-1;
            }
        } else if (Math.max(a,Math.max(b,c)) == c){
            if(a + b > c){
                ans = a + b + c;
            } else {
                ans = 2*(a + b)-1;
            }
        }
        System.out.println(ans);

    }
}