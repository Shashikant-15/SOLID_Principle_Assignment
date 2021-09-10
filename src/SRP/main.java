package SRP;

public class main {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Corporate");
        System.out.println( textManipulator.appendText("knoldus"));

        TextPrinter textPrinter = new TextPrinter(textManipulator);
        textPrinter.printText();

    }
}