import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        System.out.println("Getting user input");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int x = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
