/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */
public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();


        // 1. Create an int variable called age and assign it your age
        int age = 36;
        System.out.println("1. Age: " + age);

        // 2. Create a double variable called temperature and assign it any decimal
        double temperature = 38.7;
        System.out.println("2. Temperature: " + temperature + "°C");

        // 3. Create a char variable called gradeLetter and assign it a letter
        char gradeLetter = 'A';
        System.out.println("3. Grade Letter: " + gradeLetter);

        // 4. Create a boolean variable called isJavaFun and assign true or false
        boolean isJavaFun = true;
        System.out.println("4. Is Java Fun? " + isJavaFun);

        // 5. Create a String variable called favoriteColor and assign it a color
        String favoriteColor = "Green";
        System.out.println("5. Favorite Color: " + favoriteColor);

        // 6. Create an int array called numbers with at least 5 values, then print them
        int[] numbers = {1, 3, 5, 7, 9};
        System.out.print("6. Numbers array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Change one of the values inside the array and print the updated array
        numbers[2] = 10;
        System.out.print("7. Updated numbers array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 8. Create a String array with 3 of your favorite foods and print them in a loop
        String[] favoriteFoods = {"Pizza", "Biryani", "Pizza"};
        System.out.print("8. Favorite foods: ");
        for (String food : favoriteFoods) {
            System.out.print(food + " ");
        }
        System.out.println();

        // 9. Create two double variables, add them together, and print the result
        double num1 = 15.3;
        double num2 = 7.8;
        double sum = num1 + num2;
        System.out.println("9. " + num1 + " + " + num2 + " = " + sum);

        // 10. Use String concatenation to print a sentence
        String name = "Basel";
        System.out.println("10. My name is " + name + " and I am " + age + " years old.");
    }
}