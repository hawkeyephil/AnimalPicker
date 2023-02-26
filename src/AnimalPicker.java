import java.util.Scanner;

//Program that displays ASCII art of an animal of the users choosing 
public class AnimalPicker {
    public static void main(String[] args) {
        //Ask user for animal to draw
        System.out.println("Hello, please enter 'cat' or 'dog' for Art!");
        Scanner scanner = new Scanner(System.in);
        String animal = ""; //scanner.nextLine();

        //Ask user for input until cat or dog is returned
        while(!animal.equals("cat") && !animal.equals("dog")) {
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
            else {
                System.out.println("Invalid Input, Try Again!");
            }
        }

        //Close scanner object
        scanner.close();
    }
}
