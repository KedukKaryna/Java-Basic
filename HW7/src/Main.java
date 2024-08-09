import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[8];
//        Random num = new Random();
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = num.nextInt(50);
//            System.out.println(arr[i] + " ");
//            if (arr[i] % 2 != 0){
//                arr[i] = 0;
//            }
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));




        boolean isIncrease = true;
        int[] arr = new int[5];

        Random num1 = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = num1.nextInt( 10, 99);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            if (i > 0 && arr[i] < arr[i - 1 ]){
                isIncrease = false;
                break;
            }
        }
        System.out.println(isIncrease);

    }
}