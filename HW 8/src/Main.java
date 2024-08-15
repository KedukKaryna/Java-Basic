public class Main {
    public static void main(String[] args) {
//        Дан массив размера  n-1, содержащий только различные
//        целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//         input:
//        arr[] = {1,2,3,5}
//        out: 4
//        arr[] = {6,1,2,8,3,4,7,10,5}
//        out: 9

        int[] arr1 = {1, 2, 3, 5};
        int missing1 = findMissing(arr1, 5);
        System.out.println("Недстающий элемент: " + missing1);

        int[] arr2 = {6,1,2,8,3,4,7,10,5};
        int missing2 = findMissing(arr2, 10);
        System.out.println("Недстающий элемент: " + missing2);

    }

    public static int findMissing(int[] arr, int n){
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;

        for (int num : arr){
            sum2 += num;
        }
        return sum1 - sum2;
    }

}
//            Второе задание я не знаю как решить

//Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
//Если значение null, то параметр не должен попадать в запрос.
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';
