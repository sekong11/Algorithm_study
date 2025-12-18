import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;

        for (int i = 0; i < str.length(); ) {
            
            if (i + 3 <= str.length() && str.substring(i, i + 3).equals("dz=")) {
                count++;
                i += 3;
            }
            else if (i + 2 <= str.length()) {
                String two = str.substring(i, i + 2);
                if (two.equals("c=") || two.equals("c-") || two.equals("d-") ||
                        two.equals("lj") || two.equals("nj") || two.equals("s=") || two.equals("z=")) {
                    count++;
                    i += 2;
                } else {
                    count++;
                    i += 1;
                }
            }
            else {
                count++;
                i += 1;
            }
        }

        System.out.println(count);
    }
}