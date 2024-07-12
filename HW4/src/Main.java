import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double m = 10.5;
      double n = 10.45;
      double num = findClosest(m,n);
        System.out.println("Number" + num + "closest to 10");

    }
    public static double findClosest(double m, double n){
        double num1 = 10.0;
        double a = Math.abs(m - num1);
        double b = Math.abs(n - num1);
        if (a < b){
            return m;
        }else{
            return n;
        }
    }
}