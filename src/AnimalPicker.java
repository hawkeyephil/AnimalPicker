import java.util.Scanner;

import org.jcp.xml.dsig.internal.dom.DOMPGPData;

//Program that displays ASCII art of an animal of the users choosing 
public class AnimalPicker {
    public static void main(String[] args) {
        //Ask user for animal to draw
        System.out.println("Hello, please enter 'cat' or 'dog' for Art!");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        //Return the animal art requested
        if(animal.equals("cat")) {
            System.out.println("Cat ASCII Art Placeholder");
        }
        else if(animal.equals("dog")) {
            System.out.println("Dog ASCII Art Placeholder");
        }
        else {
            System.out.println("Invalid Input.");
        }
        scanner.close();
    }
}
