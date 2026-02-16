package basic;
import java.util.Scanner;
public class printAverage {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0;i < n; i++){
            System.out.print("enter the number : ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        int average = sum/n;
        System.out.println("average is :" + average );
        sc.close();
    }
}
