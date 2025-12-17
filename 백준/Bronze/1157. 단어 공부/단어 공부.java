import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine().toUpperCase();
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char ans = '?';

        for(int i = 0; i < 26; i++) {
            if(count[i] > max) {
                max = count[i];
                ans = (char)('A' + i);
            } else if (count[i] == max) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }

}

