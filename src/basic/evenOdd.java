package basic;
import java.util.Scanner;
public class evenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to check even or odd : ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
