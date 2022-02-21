package lesson2_hw2;

//в программе учтены только буквы нижнего регистра, при необходимости могу переделать 

public class Main {
    public static Boolean hasSameOccurences(String str) {
        char[] countWord = new char[26];
        for (int i = 0; i < str.length(); i++){
            countWord[(int) str.charAt(i) - 97] += 1;
        }
        boolean flag = true;
        for (int i = 0; i < countWord.length - 1; i++){
            if (countWord[i] == 0){
                continue;
            }
            for (int j = i + 1; j < countWord.length; j ++){
                if (countWord[j] == 0) {
                    continue;
                }
                if (countWord[i] != countWord[j]){
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                break;
            }

        }
        return flag;
    }
    public static void main(String[] args) {
        String sameOccurencesCount = "abcabc";
        System.out.println(hasSameOccurences(sameOccurencesCount)); // результат: true
        String diffOccurencesCount = "abca";
        System.out.println(hasSameOccurences(diffOccurencesCount)); // результат: false
    }
}