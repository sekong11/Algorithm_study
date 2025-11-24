import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i = 0; i < n ; i ++){
          for(int j = n; j > i+1; j--){
              System.out.print(" ");
          }
          for(int z = 0; z < i+1; z++){
              System.out.print("*");
          }
          System.out.println();
       }
    }
}