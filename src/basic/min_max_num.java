package basic;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class min_max_num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;

    /*    //using normal if_else for maximum
        if (a > b){
            max = a;
            System.out.println(max);
        }
        else {
            max = b;
            System.out.println(max);
        }
        if (c > max){
            System.out.println(c);
        }
     */

        /*    //using normal if_else for minimum
        if (a < b){
            min = a;
            System.out.println(min);
        }
        else {
            min = b;
            System.out.println(min);
        }
        if (c < min){
            System.out.println(c);
        }
     */


      /*  // using if-elif-else for maximum
        if (a > b) {
            max = a;
            System.out.println(max);
        } else if (c > b) {
            max = c;
            System.out.println(max);
        } else {
            max = b;
            System.out.println(max);
        }
       */

        /*  // using if-elif-else for minimum
        if (a < b) {
            min = a;
            System.out.println(min);
        } else if (c < b) {
            min = c;
            System.out.println(min);
        } else {
            min = b;
            System.out.println(min);
        }
       */


        //using predefined class MATH.max()

        int max2 = Math.max(a,b) ;
        System.out.println(max2);
        int maximum = Math.max(max2,c);
        System.out.println(maximum);

       /* //for minimum
        int min2 = Math.max(a,b) ;
        System.out.println(min2);
        int minimum = Math.min(min2,c);
        System.out.println(minimum);
        */
        
        sc.close();
    }

}
