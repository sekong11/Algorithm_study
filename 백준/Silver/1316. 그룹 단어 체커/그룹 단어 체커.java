import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int sum = N;
        for(int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String str1 = "";
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                str1 += ch;
                if(j+1<str.length()) {
                    if(ch != str.charAt(j+1) && str1.contains(str.charAt(j+1)+"")) {
                        sum--;
                        break;
                    }
                }
            }

        }
        System.out.println(sum);
    }
}