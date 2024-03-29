import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Creating a rectangle object using constructor
        Rectangle rect = new Rectangle(length, width);

        // Accessing attributes using getter methods
        System.out.println("\nLength: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());

        // Calculating area and perimeter using methods
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        scanner.close();
    }
}