import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double creditSum = 0;
        for(int i = 0; i < 20; i++) {
            sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            switch (grade) {
                case "A+":
                    sum += credit * 4.5;
                    creditSum += credit;
                    break;
                case "A0":
                    sum += credit * 4.0;
                    creditSum += credit;
                    break;
                case "B+":
                    sum += credit * 3.5;
                    creditSum += credit;
                    break;
                case "B0":
                    sum += credit * 3.0;
                    creditSum += credit;
                    break;
                case "C+":
                    sum += credit * 2.5;
                    creditSum += credit;
                    break;
                case "C0":
                    sum += credit * 2.0;
                    creditSum += credit;
                    break;
                case "D+":
                    sum += credit * 1.5;
                    creditSum += credit;
                    break;
                case "D0":
                    sum += credit;
                    creditSum += credit;
                    break;
                case "F":
                    creditSum += credit;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum/creditSum);
    }
}