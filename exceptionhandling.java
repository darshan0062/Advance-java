
import java.util.Scanner;

public class exceptionhandling {

    public static void main(String[] args) {
        try {
            System.out.println("Connection Established");
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a");
            int a = scan.nextInt();
            System.out.println("enter b");
            int b = scan.nextInt();
            int res = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
