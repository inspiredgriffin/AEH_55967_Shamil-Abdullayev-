package pl.pp;
import java.util.Scanner;
public class mySecondApp {
    public static void main(String[] args) {
        //this is a line comment
        Scanner scanner = new Scanner(System.in);
 /*
 This is a block comment
it can have multiple lines
just like here
 */

        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();
        scanner.close();
        System.out.println("Welcome " + forename + " " + surname);
    }
}
