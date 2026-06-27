package _1SOLID._1SingleResponsibilityPrinciple;

public class TextPrinter
{
    // Object of TextManipulator
    private TextManipulator textManipulator;

    // Constructor
    public TextPrinter(TextManipulator textManipulator)
    {
        this.textManipulator = textManipulator;
    }

    // Prints complete text
    public void printText()
    {
        System.out.println(textManipulator.getText());
    }
}

/*
SRP Explanation:

Responsibility:
Only Printing Text

Function:
1. Print Text

If printing logic changes,
only this class needs modification.

Therefore it follows the Single Responsibility Principle.

Cohesion:
High Cohesion because all methods are related to printing.
*/