//тк в задаче не указан регистр, выыод осуществлен в верхнем регистре
package hw_lesson1;

public class Main {
    public static void printAlphabet() {
        for (int i = 65; i < 91; i ++) {
            System.out.print((char) i + " ");
        }
    }
    public static void main(String[] args) {
        printAlphabet();
    }
}