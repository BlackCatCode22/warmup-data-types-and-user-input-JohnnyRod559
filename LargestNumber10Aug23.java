// Use the Scanner class
import java.util.Scanner;
public class LargestNumber10Aug23 {
    public static void main(String[] args) {

        System.out.println("\n\nGreat you're here lets get started! \n\n");
        Scanner scanner = new Scanner(System.in);


        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println(" You entered: " + num1);

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(" You entered: " + num2);

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.println(" You entered: " + num3);

        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();
        System.out.println(" You entered: " + num4);

        System.out.println("\n The numbers are: " + num1 + ", " + num2 + ", " + num3 + ", and " + num4);

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;

        }
        System.out.println("\nThe largest number is: " + largest);

        System.out.println("\n\n Thanks for participating! \n\n");

        scanner.close();
    }
}
