import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        for(int i = 1; i <= 2*n; i++){
            for(int j = abs(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(n - abs(n-i))-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

