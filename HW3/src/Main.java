import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.nextLine();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter second word:");
        String word2 = scan1.nextLine();

        String first = word1.substring(word1.length() / 2);
        String second = word2.substring(word2.length() / 2);

        String word3 = first + second;

        System.out.println(word3);
    }
}

