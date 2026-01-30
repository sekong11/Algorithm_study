import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (true) {
            if(n - i > 0) {
                n = n - i;
                i++;
            } else {
                if(i % 2 == 0){
                    System.out.println(n+"/"+(i+1-n));
                    break;
                }
                else {
                    System.out.println((i+1-n)+"/"+n);
                    break;
                }
            }
        }

    }
}