import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt user for height in feet and inches
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert the height to inches
        int totalInches = (feet * 12) + inches;

        // Convert the height to meters
        double heightInMeters = totalInches * 0.0254;

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the BMI
        System.out.println("BMI is " + bmi);

        // Determine and display the interpretation of BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}