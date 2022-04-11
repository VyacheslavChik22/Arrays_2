import java.util.Arrays;

public class arrays_2 {
    public static void main(String[] args) {
        int payForMonth = 0;
        int minPay = 0;
        int maxPay = 0;
        double averagePayForMonth = 0;

        int[] arr = new int[30];                     // Объявляем массив с длиной в 30 элементов
        for (int i = 0; i < arr.length; i++) {       // Обходим элементы массива, присваиваем каждому элементу случайное число в
            // промежутке от 100 до 200
            arr[i] = (int) (Math.random() * 100) + 101;   // int отбрасывает числа после запятой и чтобы включить 200 пишем + 101
            payForMonth += arr[i];                        // Сумма значений всех элементов массива.


        }
//Задание 1: Посчитать сумму всех выплат за месяц.

        System.out.println(Arrays.toString(arr)); //Ежедневная выплата
        System.out.println("\n*** Задание1 - Сумма всех выплат в месяц ***");
        System.out.println("Сумма выплат за месяц составила: " + payForMonth + " рублей.");



//Задание 2 Найти минимальную и максимальную трату за день.
        System.out.println("\n*** Задание2 - Минимальная и максимальная траты за день ***");

        Arrays.sort(arr); // Сортируем массив: arr[0] - минимальное значение,  arr[29] -максимальное значение.
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день " +
                "составила " + arr[29] + " рублей.");

//Задание 3 Средняя сумма трат в течение данных 30 дней.
        System.out.println("\n*** Задание3 - Средняя трата за месяц ***");
        averagePayForMonth = payForMonth / arr.length; // Сумму значений всех элементов массива делим на его длинну

        System.out.println("Средняя сумма трат за месяц составила: "+ averagePayForMonth +" рублей.");


//Задание 4: Появился баг - Что-то пошло нет так.

        System.out.println("\n*** Задание4 - Исправить баг с именами сотрудников. ***");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'}; // Нужно развернуть массив
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
        for (int i = reverseFullName.length-1; i >= 0; i--) { // Обходим элементы массива от конца до начала
            System.out.print(reverseFullName[i] + " ");       // Выводим в консоль
        }


    }

}
