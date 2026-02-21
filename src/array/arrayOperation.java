package array;
import java.util.Scanner;
public class arrayOperation {
   /* Scanner sc = new Scanner(System.in);
    int[] box;
    int size;*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int[] box = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("enter array element " + i + " : ");
            box[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print(box[i]);
        }

        /*System.out.print("Enter your choice :");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("min in array");
                break;
            case 2 :
                System.out.println("max in array");
                break;
            case 3 :
                System.out.println("insert element at start");
                System.out.print(insert_at_start());
                break;
            case 4 :
                System.out.println("insert element at end");
                break;
            case 5 :
                System.out.println("insert element at specific index");
                break;
            case 6 :
                System.out.println("remove specific element");
                break;
            case 7 :
                System.out.println("average");
                break;
            case 8 :
                System.out.println("middle element");
                break;
            case 9 :
                System.out.println("comtinue");
                break;
            case 10 :
                System.out.println("exit");
                break;
        }*/
    }
    /*public static int insert_at_start(int[] box, int size, Scanner sc){
        System.out.print("enter the number : ");
        int pos1 = sc.nextInt();
        box[0] = pos1;
        return 0;
    }*/
}
