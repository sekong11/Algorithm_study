
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] answer = new int[26];
        for(int i = 0; i < 26; i++){
            answer[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i);
            if(answer[num-'a'] == -1){
                answer[num - 'a'] = i;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(answer[i]+" ");
        }

    }
}
