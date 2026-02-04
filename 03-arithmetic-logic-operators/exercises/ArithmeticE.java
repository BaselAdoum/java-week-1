/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */
public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // 1. Create two int variables x and y, then perform all arithmetic operations.
        int x = 15;
        int y = 4;
        System.out.println("1. All operations with x=" + x + " and y=" + y + ":");
        System.out.println("   Sum: " + (x + y) + " (" + x + " + " + y + ")");
        System.out.println("   Difference: " + (x - y) + " (" + x + " - " + y + ")");
        System.out.println("   Product: " + (x * y) + " (" + x + " × " + y + ")");
        System.out.println("   Quotient: " + (x / y) + " (" + x + " ÷ " + y + ")");
        System.out.println("   Remainder: " + (x % y) + " (" + x + " % " + y + ")");

        // 2. Try division with numbers that don't divide evenly (e.g., 7 / 2).
        System.out.println("\n2. Division with uneven numbers:");
        int num1 = 7;
        int num2 = 2;
        System.out.println("   " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("   Important: Integer division truncates decimal part!");

        // 3. Use double variables for division and compare with int division.
        System.out.println("\n3. Comparing int vs double division:");
        int intA = 7, intB = 2;
        double doubleA = 7.0, doubleB = 2.0;
        System.out.println("   Integer division (7 / 2): " + (intA / intB));
        System.out.println("   Double division (7.0 / 2.0): " + (doubleA / doubleB));
        System.out.println("   Mixed division (7 / 2.0): " + (intA / doubleB));

        // 4. Create three int variables, add them, and print the total.
        System.out.println("\n4. Sum of three numbers:");
        int n1 = 5, n2 = 10, n3 = 15;
        int total = n1 + n2 + n3;
        System.out.println("   " + n1 + " + " + n2 + " + " + n3 + " = " + total);

        // 5. Calculate the square of a number (e.g., 6 * 6).
        System.out.println("\n5. Calculating squares:");
        int number = 6;
        int square = number * number;
        System.out.println("   Square of " + number + " = " + number + "² = " + square);

        // Also show 9²
        int nine = 9;
        System.out.println("   Square of " + nine + " = " + nine + "² = " + (nine * nine));

        // 6. Calculate the average of three numbers.
        System.out.println("\n6. Average of three numbers:");
        int score1 = 85, score2 = 90, score3 = 88;
        // Wrong way (integer division):
        int wrongAverage = (score1 + score2 + score3) / 3;
        // Right way (cast to double):
        double correctAverage = (score1 + score2 + score3) / 3.0;
        System.out.println("   Scores: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("   Wrong average (int division): " + wrongAverage);
        System.out.println("   Correct average (double): " + correctAverage);


        // AI answer:
        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        System.out.println("\n7. Division by zero:");

        System.out.println("   A) First, let's see what happens with double division:");
        System.out.println("   10.0 / 0.0 = " + (10.0 / 0.0));
        System.out.println("   -10.0 / 0.0 = " + (-10.0 / 0.0));
        System.out.println("   0.0 / 0.0 = " + (0.0 / 0.0));
        System.out.println("   Double division by zero gives special values!");

        System.out.println("\n   B) Now, let's see what happens with integer division:");
        System.out.println("   WARNING: The next line will cause an error and stop the program!");
        System.out.println("   Uncomment it to see what happens:");
        System.out.println("   // System.out.println(10 / 0);");

        // Don't actually run this line - it would crash the program!
        // System.out.println(10 / 0);

        System.out.println("\n   Summary:");
        System.out.println("   - Double ÷ 0.0 = Infinity (or -Infinity)");
        System.out.println("   - Integer ÷ 0 = ERROR (program stops)");
        System.out.println("   - Always check before dividing!");
    }
}