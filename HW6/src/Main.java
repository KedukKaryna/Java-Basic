public class Main {
    public static void main(String[] args) {
//   int temp1 = 95;
//   int temp2 = 120;
//   checkDevice(temp1,temp2);
//        System.out.println(checkDevice(temp1,temp2));
//    }
//
//    private static boolean checkDevice(int temp1, int temp2) {
//        return temp1 > 100 && temp2 < 100 ;
//
    }
}

//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.




//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму,
// которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день,
// сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее


private static int getCountWithdrawDays(int sum){
    int divider;
    int countDay = 0;
    while (sum >= 1){
        countDay++;
        divider = getGcd(sum);
        sum -= divider;
        System.out.println("withdraw" + divider + " balance = " + sum);
    }
    return countDay;
}

private static int getGcd(int sum) {
    if (sum != 1){
        for (int i = sum -1; i >= 1 ; i--){
            if(sum % i == 0){
                return  i;
            }
        }
    }
    return 1;
}