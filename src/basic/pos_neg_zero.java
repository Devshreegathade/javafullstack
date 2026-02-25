package basic;
import java.util.Scanner;
public class pos_neg_zero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Positive negative or Zero");
        System.out.println("enter a number to check");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("number is negative");
        } else if (num > 0) {
            System.out.println("number is positive");
        } else if ( num == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("no proper input");
        }
        sc.close();
    }
}
