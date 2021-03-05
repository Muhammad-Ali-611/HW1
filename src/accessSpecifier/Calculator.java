package accessSpecifier;

public class Calculator {
    public int addition(int num1, int num2){

        int total = num1 + num2;
        return total;
    }
    public int substraction(int num1, int num2){

        int total = num1 - num2;
        return total;
    }
    public int multiply(int num1, int num2){

        int total = num1 * num2;
        return total;
    }
    public void task(int num1, int num2){

        int total = num1 * num2;
        System.out.println("total result of 2 numbers");
    }
}
