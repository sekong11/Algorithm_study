import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)-'0'>10){
                int a = str.charAt(i) - 55;
                sum += (int)(a*Math.pow(n,str.length()-i-1));
            }else {
                sum += (int)((str.charAt(i)-'0')*Math.pow(n,str.length()-i-1));
            }
        }
        System.out.println(sum);
    }
}