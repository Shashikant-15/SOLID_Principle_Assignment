package SRP;


//Functionality of the Method used in SRP

public class TextManipulator {
    private String text;
    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String appendText(String newText) {
        text = text.concat(newText);
        return text;
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }
}