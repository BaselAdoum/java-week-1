public class VariablesE
{
    public static void main(String[] args)
    {
        // Pre-existing variables
        int myNumber = 10;
        int myNumber2 = 11;

        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;
        char myLetter = 'B';
        float myFloat = 2.5f;
        long myBigNumber = 65454163L;
        byte mySmallNumber = 1;
        short myShortNumber = -5;

        // Print pre-existing variables
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);

        // -------------------- Student Exercises --------------------
        // 1. Print the char variable
        System.out.println("Char: " + myLetter);

        // 2. Print the float variable
        System.out.println("Float: " + myFloat);

        // 3. Print the long variable
        System.out.println("Long: " + myBigNumber);

        // 4. Print the byte variable
        System.out.println("Byte: " + mySmallNumber);

        // 5. Print the short variable
        System.out.println("Short: " + myShortNumber);

        // 6. Change the value of myNumber and print it
        myNumber = 42;
        System.out.println("Updated Integer: " + myNumber);

        // 7. Add two int variables and print the result
        int sum = myNumber + myNumber2;
        System.out.println("Sum of myNumber and myNumber2: " + sum);

        // 8. Create a String variable for your name and print a greeting
        String myName = "Basel";
        System.out.println("Hello, " + myName + "! Welcome to Java.");
    }
}
