/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */
public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);


        // 1. Create a short variable with any value and assign it to an int (implicit)
        short shortNum = 200;
        int intFromShort = shortNum; // Implicit widening
        System.out.println("1. short (" + shortNum + ") → int: " + intFromShort);

        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int largeInt = 2_147_483_000; // Close to int max value
        long longFromInt = largeInt; // Implicit widening
        System.out.println("2. int (" + largeInt + ") → long: " + longFromInt);

        // 3. Create a long variable and assign it to a float (implicit)
        long longNum = 9_876_543_210L;
        float floatFromLong = longNum; // Implicit widening (may lose precision)
        System.out.println("3. long (" + longNum + ") → float: " + floatFromLong);

        // 4. Create a double variable and cast it to a float (explicit)
        double doubleNum = 123.456789;
        float floatFromDouble = (float) doubleNum; // Explicit narrowing
        System.out.println("4. double (" + doubleNum + ") → float: " + floatFromDouble);
        System.out.println("   Note: Lost some precision (rounded)");

        // 5. Create an int variable and cast it to a short (explicit)
        int mediumInt = 32000;
        short shortFromInt = (short) mediumInt; // Explicit narrowing
        System.out.println("5. int (" + mediumInt + ") → short: " + shortFromInt);

        // 6. Create a long variable and cast it to a byte (explicit)
        long veryLong = 300L;
        byte byteFromLong = (byte) veryLong; // Explicit narrowing (overflow)
        System.out.println("6. long (" + veryLong + ") → byte: " + byteFromLong);

        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        int largeNumber = 1000;
        byte byteFromLargeInt = (byte) largeNumber; // Explicit narrowing (overflow)
        System.out.println("7. int (" + largeNumber + ") → byte: " + byteFromLargeInt);
        System.out.println("   Explanation: Byte range is -128 to 127. 1000 overflows and wraps around.");
        System.out.println("   How overflow works: 1000 % 256 = 1000 - 976 = 24, but byte interprets as -232");
        System.out.println("   Actually: 1000 in binary → take last 8 bits → 11101000 = -24 in two's complement");

        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        char myChar = 'Z';
        int asciiValue = myChar; // Implicit widening
        System.out.println("8. char ('" + myChar + "') → int (ASCII): " + asciiValue);

        // 9. Convert an int into a char and print the resulting character
        int code = 65;
        char charFromInt = (char) code; // Explicit narrowing (but safe for Unicode)
        System.out.println("9. int (" + code + ") → char: '" + charFromInt + "'");

        // 10. Create a double with decimals, convert it to int, and print the result
        double decimalNum = 45.99;
        int intFromDouble = (int) decimalNum; // Explicit narrowing
        System.out.println("10. double (" + decimalNum + ") → int: " + intFromDouble);
        System.out.println("    Explanation: Decimal part (.99) is truncated, not rounded!");

        // Additional demonstration of overflow
        System.out.println("\n=== Overflow Examples ===");
        int testInt1 = 128;
        byte testByte1 = (byte) testInt1;
        System.out.println("int " + testInt1 + " → byte: " + testByte1 + " (overflow: " + testInt1 + " - 256 = " + testByte1 + ")");

        int testInt2 = 300;
        byte testByte2 = (byte) testInt2;
        System.out.println("int " + testInt2 + " → byte: " + testByte2 + " (overflow: " + testInt2 + " - 256 = 44, but 44 is in range)");

        // What happens with negative overflow
        int testInt3 = -130;
        byte testByte3 = (byte) testInt3;
        System.out.println("int " + testInt3 + " → byte: " + testByte3 + " (underflow: " + testInt3 + " + 256 = " + testByte3 + ")");
    }
}
