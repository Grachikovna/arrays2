public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("//task 1");
        int[] payments = {40000,35000,200000,38000,93000};
        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        System.out.println("//task 2");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int payment : payments) {
            if (payment < min) {
                min = payment;
            }
            if (max < payment) {
                max = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min
                + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей ");

        //task 3
        System.out.println("//task 3");
        int average = sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //task 4
        System.out.println("//task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}