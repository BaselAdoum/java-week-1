/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

import java.util.Scanner;
import java.util.Scanner;

public class LoopsExercise
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1: Print numbers from input to 1 (reverse order)
        int number = 0;

        while (true)
        {
            System.out.print("Enter a positive number for countdown: ");
            if (scanner.hasNextInt())
            {
                number = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                if (number > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number (greater than 0).");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid token
            }
        }

        System.out.println("\nCountdown from " + number + " to 1:");
        for (int num = number; num >= 1; num--) {
            System.out.println(num);
        }
        // Exercise 2: Print multiplication table with validation
        int tableNumber = 0;

        while (true)
        {
            System.out.print("Enter a number for multiplication table (1-20): ");
            if (scanner.hasNextInt())
            {
                tableNumber = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                if (tableNumber >= 1 && tableNumber <= 20) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 20.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid token
            }
        }

        System.out.println("\nMultiplication table of " + tableNumber + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " × " + i + " = " + (tableNumber * i));
        }
        //Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
        System.out.print("\nEnter color(s): ");
        scanner.nextLine(); // Clear buffer
        String input = scanner.nextLine();

        if (input.contains(" ")) {
            // Multiple words
            String[] colors = input.split(" ");
            System.out.println("\nColors in uppercase:");
            for (String color : colors) {
                System.out.println(color.toUpperCase());
            }
        } else {
            // Single word
            System.out.println("Color in uppercase: " + input.toUpperCase());
        }
    }
}

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).

        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.

        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.

        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.

        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.

        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).

        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****

        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.

        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.


