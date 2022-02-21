package hw_lesson1;

public class Main {
    public static void printReverseAlphabet() {
        char [] letters = new char [26];
        int j = 0;
        for (int i = 90; i > 64; i --) {
            letters[j] = (char) i;
            System.out.print(letters[j]  + " ");
            j += 1;
        }
    }
    public static void main(String[] args) {
        printReverseAlphabet();
    }
}