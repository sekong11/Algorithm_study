import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int a = Integer.parseInt(new StringBuilder().append(str1).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(str2).reverse().toString());

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
