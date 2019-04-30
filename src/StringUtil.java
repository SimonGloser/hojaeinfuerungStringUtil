public class StringUtil {

    private String[] words;

    public StringUtil(String[] words) {
        this.words = words;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public void printInSmallLetters(){
        System.out.println("-------------------");
        for (int i = 0; i < this.words.length; i++) {
            System.out.println("Wort in Kleinbuchstaben: " + this.words[i].toLowerCase());
        }
    }
}
