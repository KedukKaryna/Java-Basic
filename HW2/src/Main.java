public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");
        System.out.println(str);
        System.out.println(str.charAt(str.length()-2));
        System.out.println(str.contains("Java"));
        System.out.println(str.substring(14, 18));
        System.out.println(str.replace("a" , "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}