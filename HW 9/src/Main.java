

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Увеличьте одновременное количество игроков до трех.
//        Три игрока вводят номера для игры.
//        Лотерея играет один раз.

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Player 1, enter your number:");
        int player1 = scan.nextInt();

        System.out.println("Player 2, enter your number:");
        int player2 = scan.nextInt();

        System.out.println("Player 3, enter your number:");
        int player3 = scan.nextInt();

        int lotteryNumber = rand.nextInt(100) + 1; // Генерация случайного числа от 1 до 100
        System.out.println("Lottery number is: " + lotteryNumber);

        checkWinner(player1, lotteryNumber, 1);
        checkWinner(player2, lotteryNumber, 2);
        checkWinner(player3, lotteryNumber, 3);
    }

    private static void checkWinner(int player, int lotteryNumber, int playerId) {
        if (player == lotteryNumber) {
            System.out.println("Player " + playerId + " wins!");
        } else {
            System.out.println("Player " + playerId + " did not win.");
        }

    }

}