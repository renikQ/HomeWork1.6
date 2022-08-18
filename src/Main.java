public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        int sumExpensive = 0;
        for (int i = 0; i < arr.length; i++) {
            sumExpensive = sumExpensive + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumExpensive + " рублей");

        // задание 2
        int minExpensivePerDay = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpensivePerDay) {
                minExpensivePerDay = arr[i];
            }
        }
        int maxExpensivePerDay = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] > maxExpensivePerDay) {
                maxExpensivePerDay = arr[i1];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + minExpensivePerDay + " рублей. " +
                    "Максимальная сумма трат за день составила " + maxExpensivePerDay + " рублей");

        // Задание 3
        double averageExpensivePerDay = sumExpensive / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpensivePerDay + " рублей");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]);
        }
    }
}