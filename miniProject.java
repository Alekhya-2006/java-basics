
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        // Mini project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*1000);
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
        } while(userNumber >= 0);
        System.out.println("My number was: ");
        System.out.println(myNumber);

    }
}
