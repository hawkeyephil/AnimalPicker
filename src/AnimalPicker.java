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
                System.out.println("Cat ASCII Art Placeholder");
            }
            else if(animal.equals("dog")) {
                System.out.println("Dog ASCII Art Placeholder");
            }
            else {
                System.out.println("Invalid Input, Try Again!");
            }
        }

        scanner.close();
    }
}
