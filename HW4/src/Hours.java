import java.util.Random;

public class Hours {
    public static void main(String[] args) {
        Random num = new Random();
        int a = num.nextInt(28800);
        System.out.println("Left: " + a + " seconds");
        int hours = a / 3600;
        if (hours > 1){
            System.out.println("Left " + hours + " hour");
//        }
        }else{
            System.out.println("Less than an hour left");
        }
    }
}
