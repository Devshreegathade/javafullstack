package array;
import java.util.Scanner;
public class arrayOperation {

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
            System.out.println(box[i]);
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
        System.out.println("12 . display");
        System.out.println("12 . exit ");

        System.out.print("Enter your choice :");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("min in array");
                int minnum = box[0];
                for (int i = 0;i < n;i++){
                    if (box[i] < minnum){
                        minnum = box[i];
                    }
                }
                System.out.println(minnum);
                break;
            case 2 :
                System.out.println("max in array");
                int maxnum = box[0];
                for (int i = 0;i < n;i++){
                    if (box[i] > maxnum){
                        maxnum = box[i];
                    }
                }
                System.out.println(maxnum);
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
                System.out.println("enter the new number ");
                int posn = sc.nextInt();
                box[n-1] = posn;
                for (int i = 0; i < n; i++){
                    System.out.println(box[i]);
                }
                break;
            case 5 :
                System.out.println("replace custom element");
                System.out.println("enter the number you want to replace :");
                int rep_num = sc.nextInt();
                System.out.println("enter the new number ");
                int number = sc.nextInt();
                for (int i = 0; i < n; i++){
                    if (rep_num >= 0 && rep_num < n){
                        box[rep_num] = number;
                        System.out.println("Element replaced successfully.");
                    }
                    else {
                        System.out.println("Invalid index!");
                    }
                }
                for (int i = 0; i < n; i++){
                    System.out.println(box[i]);
                }
                break;
            case 7 :
                System.out.println("remove specific element");
                break;
            case 6 :
                System.out.println("average/mean");
                int count = 0;
                for (int i = 0;i < n; i++){
                    count += box[i];
                }
                int avg = count/n;
                System.out.println(avg);
                break;
            case 8 :
                System.out.println("middle element");
                break;

            case 12 :
                System.out.println("display");
                break;
            default:
                break;
        }
    }
}
