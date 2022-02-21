package lesson2_hw2;

public class Main {
    public static String removeDuplicateWords(String str) {
        String[] wordsExample = str.split(" ");
        String newString = "";
        for (int i = 0; i < wordsExample.length - 1; i++) {
            for (int j = i + 1; j < wordsExample.length; j++) {
                if (wordsExample[i].equals(wordsExample[j])) {
                    break;
                }
                if (j == wordsExample.length - 1){
                    newString += " " + wordsExample[i];
                }
            }
        }
        newString += " " + wordsExample[wordsExample.length - 1];

        return newString;
    }
    public static void main(String[] args) {
        String example = "один один три два два два";
        System.out.println(removeDuplicateWords(example)); // результат: "один три два"
        String example2 = "один один два три три один два два два";
        System.out.println(removeDuplicateWords(example2));
    }
}