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
        System.out.println("menu : ");
        System.out.println("1 . min ");
        System.out.println("2 . max ");
        System.out.println("3 . replace start element ");
        System.out.println("4 . replace last element ");
        System.out.println("5 . replace custom element ");
        System.out.println("6 . insert at start ");
        System.out.println("7 . insert at last ");
        System.out.println("8 . insert at custom location ");
        System.out.println("9 . delete from custom location ");
        System.out.println("10 . average of array ");
        System.out.println("11 . middle element ");
        System.out.println("12 . exit ");

        System.out.print("Enter your choice :");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("min in array");
                break;
            case 2 :
                System.out.println("max in array");
                break;
            case 3 :
                System.out.println("replace element at start");
                System.out.println("enter the new number ");
                int pos1 = sc.nextInt();
                box[0] = pos1;
                for (int i = 0; i < n; i++){
                    System.out.println(box[i]);
                }
                break;
            case 4 :
                System.out.println("replace last element");
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

            case 12 :
                System.out.println("exit");
                break;
            default:
                break;
        }
    }
    /*public static int insert_at_start(int[] box, int size, Scanner sc){
        System.out.print("enter the number : ");
        int pos1 = sc.nextInt();
        box[0] = pos1;
        return 0;
    }*/
}
