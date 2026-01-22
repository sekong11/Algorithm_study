import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int g;
        int h;
        if (a == c){
            g = e;
        } else if(a == e){
            g = c;
        } else {
            g = a;
        }
        if (b == d){
            h = f;
        } else if(b == f){
            h = d;
        } else {
            h = b;
        }
        System.out.println(g+" "+h);

    }
}