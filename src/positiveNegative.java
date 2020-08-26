import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {

        System.out.println("Test Data");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }




//        Test Data
//        Enter a number: 35
//        35 is positive.
    }

}
