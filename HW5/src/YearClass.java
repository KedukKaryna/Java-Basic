import java.util.Scanner;

import static java.time.Year.isLeap;

public class YearClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");

        int a = scan.nextInt();

        if (isLeap(a)) {
            System.out.println(a + "Високосный год");
        } else {
            System.out.println(a + "Не високосный год: ");
        }
    }

    private static boolean isLeap(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


//         Реализуйте программу, которая попросит пользователя ввести год и
//        напечатать этот год isLeap (високосный) или нет.