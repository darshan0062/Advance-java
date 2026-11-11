
import java.util.Scanner;

public class multiplecatchblock {

    public static void main(String[] args) {
        System.out.println("Connection established .....");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a :");
            int a = scan.nextInt();
            System.out.println("Enter b:");
            int b = scan.nextInt();
            int res = a / b;
            System.out.println("Div res is : " + res);
            System.out.println("Enter the size of the Array :");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the element to be inserted :");
            int element = scan.nextInt();
            System.out.println("Enter the index at which element to be inserted");
            int index = scan.nextInt();
            arr[index] = element;
            System.out.println("Element is stored in the Array ");
        } catch (ArithmeticException e1) {
            System.out.println("Exception handled .....");
        } catch (NegativeArraySizeException e2) {
            System.out.println("Exception handled .....");
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("Exception handled .....");
        }
        System.out.println("Connection terminated ......");
    }
}
