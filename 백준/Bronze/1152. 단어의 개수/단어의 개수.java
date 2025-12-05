import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        
        if(str.isEmpty()){
            System.out.println(0);
        }else {
            String[] strs = str.split(" ");
            System.out.println(strs.length);
        }
    }
}
