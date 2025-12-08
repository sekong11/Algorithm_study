import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
            if(arr[i]>='A' && arr[i]<= 'C'){
                sum += 3;
            } else if(arr[i]>='D'&& arr[i]<='F'){
                sum += 4;
            } else if(arr[i]>='G'&& arr[i]<='I'){
                sum += 5;
            } else if(arr[i]>='J'&& arr[i]<= 'L'){
                sum += 6;
            } else if(arr[i]>='M'&& arr[i]<= 'O'){
                sum += 7;
            } else if(arr[i]>='P'&& arr[i]<='S'){
                sum += 8;
            }  else if(arr[i]>='T'&& arr[i]<='V'){
                sum += 9;
            } else if(arr[i]>='W'&& arr[i]<='Z'){
                sum += 10;
            }
        }
        System.out.println(sum);

    }
}
