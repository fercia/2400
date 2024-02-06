import java.util.Scanner;

public class AgeAndName {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Show name and age entered 
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Bye");


        
        scanner.close();
    }
}