package SRP;

import java.util.Arrays;


//Functionality of the Method used in SRP

class TextPrinter {
    TextManipulator textManipulator;
    public TextPrinter(TextManipulator textManipulator) {

        this.textManipulator = textManipulator;
    }

    //Functionality of the Method used

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    //Functionality of the Method used
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    //Functionality of the Method used
    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}