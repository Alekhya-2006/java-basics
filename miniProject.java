
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        // My First project
        // Guess the number
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*1000); // The random number is from 1- 1000
        int userNumber = 0;

        do {
            System.out.println("Guess a number(1-1000): ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println(" Oh my god ! How did you Guessed it ? ");
                break;
            }
            else if(userNumber> myNumber) {
                System.out.println("Your number is too large");

            }
            else {
                System.out.println("Your number is too small");
            }
        } while(userNumber >= 0);  // If you give -ve number, It means u want to  know the number
        System.out.println("My number was: ");
        System.out.println(myNumber);

    }
}

