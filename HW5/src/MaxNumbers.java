import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Введите первое число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num3 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int max = numMax(num1,num2,num3);
        System.out.println("Максимальное число: " + max);
    }

    private static int numMax(int a, int b, int c) {
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }
}


//        Реализуйте программу, которая попросит пользователя ввести три целых
//        числа (используйте сканер) и напечатает максимум из трех чисел.
