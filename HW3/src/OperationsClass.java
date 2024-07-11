public class OperationsClass {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
        System.out.println(addition(num1, num2));
        System.out.println(subtraction(num1, num2));
        System.out.println(multiplication(num1, num2));
        System.out.println(division(num1, num2));
    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }

}
