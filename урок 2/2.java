package lesson2_hw2;

public class Main {
    public static String capitalizeEachWord(String str) {
        String [] wordArray = str.split(" ");
        String strNew = "";
        for (int i = 0; i < wordArray.length; i ++){
            strNew += wordArray[i].substring(0, 1).toUpperCase() + wordArray[i].substring(1) + " ";
        }
        return strNew;
    }
    public static void main(String[] args) {
        String example = "Каждый охотник желает знать где сидит фазан";

        System.out.println(capitalizeEachWord(example)); // результат: "Каждый Охотник Желает Знать Где Сидит Фазан"

    }
}