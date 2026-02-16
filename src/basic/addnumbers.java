package basic;
import java.util.Scanner;
public class addnumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter count of numbers to add");
        int n = input.nextInt();

        int[] numbers = new int[n];                         //array creation
        int sum = 0;

        for (int i = 0; i < n;i++ ){                        //initialized a loop
            System.out.print("enter the number :");
            numbers[i] = input.nextInt();                     //taking the input
            sum += numbers[i];                                //adding values to sum
        }

        System.out.println(sum);
        input.close();
    }
}
