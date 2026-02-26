package basic;
import java.util.Scanner;
public class temp_unit_convert {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit Converter");
        System.out.println("Enter temperature in Celsius :");
        int C = sc.nextInt();
        int F = (C * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is :" + F);
        sc.close() ;
    }
}
