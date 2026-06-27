package _1SOLID._1SingleResponsibilityPrinciple;

public class TextManipulator
{
    // Stores the text
    private String text;

    // Constructor
    public TextManipulator(String text)
    {
        this.text = text;
    }

    // Returns current text
    public String getText()
    {
        return text;
    }

    // Adds new text
    public void appendText(String newText)
    {
        text = text.concat(newText);
    }

    // Replaces a word with another word
    public String findWordAndReplace(String word, String replacementWord)
    {
        if(text.contains(word))
        {
            text = text.replace(word, replacementWord);
        }

        return text;
    }

    // Deletes a word
    public String findWordAndDelete(String word)
    {
        if(text.contains(word))
        {
            text = text.replace(word, "");
        }

        return text;
    }
}

/*
SRP Explanation:

Responsibility:
Only Text Manipulation

Functions:
1. Append Text
2. Replace Text
3. Delete Text

This class does not print text.
Therefore it follows the Single Responsibility Principle.

Cohesion:
High Cohesion because all methods are related to text manipulation.
*/