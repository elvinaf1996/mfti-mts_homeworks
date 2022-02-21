package lesson2_hw2;

public class Main {
    public static Double calc(String equation) {
        String[] numArray = equation.split(" ");
        double num1 = Double.parseDouble(numArray[0]);
        double num2 = Double.parseDouble(numArray[2]);
        if(numArray[1].equals("+")){
            return num1 + num2;
        }
        else if(numArray[1].equals("-")){
            return num1 - num2;
        }
        else if(numArray[1].equals("*")){
            return num1 * num2;
        }
        else{
            return num1 / num2;
        }
    }
    public static void main(String[] args) {
        String equation = "123123 + 123123";
        System.out.println(calc(equation)); // результат: 246246
    }
}