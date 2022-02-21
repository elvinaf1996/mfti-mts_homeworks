package lesson2_hw2;

public class Main {
    public static String getMiddleCharacter(String str) {
        int a = str.length();
        int lenWorld = str.length();
        return str.substring((lenWorld - 1) / 2, (lenWorld - 1) / 2 + 2 - lenWorld % 2);
    }
    public static void main(String[] args) {
        String oddString = "слово";
        System.out.println(getMiddleCharacter(oddString)); // результат: "О"
        String evenString = "пять";
        System.out.println(getMiddleCharacter(evenString)); // результат: "ят"
    }
}