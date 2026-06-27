package _1SOLID._1SingleResponsibilityPrinciple;

public class SRPDemo
{
    public static void main(String[] args)
    {
        // Create object
        TextManipulator textManipulator =
                new TextManipulator("Hello Java");

        // Manipulate text
        textManipulator.appendText(" World");

        textManipulator.findWordAndReplace(
                "Java",
                "Cognizant"
        );

        // Print text
        TextPrinter textPrinter =
                new TextPrinter(textManipulator);

        textPrinter.printText();
    }
}

/*
Expected Output:

Hello Cognizant World

Conclusion:

TextManipulator -> Manipulates Text
TextPrinter     -> Prints Text

Each class has only one responsibility.

Hence the code follows
Single Responsibility Principle (SRP).
*/