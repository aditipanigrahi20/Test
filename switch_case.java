import java.util.Scanner;

public class whileloop {
    public static void main(String args[]) {
        System.out.println("Getting user input");
        Scanner sc = new Scanner(System.in);

        System.out.println("AGE");
        int x = sc.nextInt();
        /*if (x%2==0) {
            System.out.println("even no"); 
        }
        else{
            System.out.println("odd no");
        }/* */
        switch (x) {
            case 3:
                System.out.println("this is three ,u have to wait till police");
                break;
            case 2:
                 System.out.println("ths is two,u have wait till police officer");
                 break;

            default:
                 System.out.println("u can goo now");

                break;
        }

        sc.close();
    }
}

