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
        this.printLines();
        for (int i = 0; i < this.words.length; i++) {
            System.out.println("Wort in Kleinbuchstaben: " + this.words[i].toLowerCase());
        }
    }
    public void printViseVersa(){
        this.printLines();
        System.out.println("Eingabe in umgekehrter Reihenfolge:");
        for (int i = this.words.length - 1; i >= 0; i--) {

            System.out.print(this.words[i] + " ");
        }
    }
    private void printLines(){
        System.out.println("-------------------");
    }
}
