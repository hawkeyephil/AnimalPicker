/* 
 * Author: Philip Caldarella
 * Created: 2/25/23
 * Modified: 2/26/23
 * Project: CSC109 AnimalPicker Assignment
 */
import java.util.Scanner;

//Program that displays ASCII art of an animal of the users choosing 
public class AnimalPicker {
    public static void main(String[] args) {
        //Ask user for animal to draw
        System.out.println("Hello, please enter 'cat', 'dog', or 'fish' for Art!");
        Scanner scanner = new Scanner(System.in);
        String animal = ""; //scanner.nextLine();

        //Ask user for input until cat or dog is returned
        while(!animal.equals("cat") && !animal.equals("dog") && !animal.equals("fish")) {
            animal = scanner.nextLine(); 
            //Return the animal art requested or ask user again
            if(animal.equals("cat")) {
                //Cat ASCII Art
                System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
            }
            else if(animal.equals("dog")) {
                //Dog ASCII Art
                System.out.println("          __\n \\ ______/ V`-,\n  }        /~~\n /_)^ --,r\'\n|b      |b");
            }
            else if(animal.equals("fish")) {
                //Fish ASCII Art
                System.out.println("     |\\    o\n    |  \\    o\n|\\ /    .\\ o\n| |       (\n|/ \\     /\n    |  /\n     |/"); 
            }
            else {
                System.out.println("Invalid Input, Try Again!");
            }
        }

        //Close scanner object
        scanner.close();
    }
}
