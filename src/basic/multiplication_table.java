package basic;
import java.util.Scanner;

public class multiplication_table {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter for which number table you want :");
        int num = sc.nextInt();
        System.out.println("for how many rows :");
        int count = sc.nextInt();
        for (int i = 1; i <= count ; i++){
            System.out.println(num *i);
        }
        sc.close();
    }
}
