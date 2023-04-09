public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int a = 0; a < 10; a = a + 1) {
            System.out.println("Итерация цикла 'a' " + a);
        }

        System.out.println("Задание 2");

        for (int b = 10; b > 0; b = b - 1) {
            System.out.println("Итерация цикла 'b' " + b);
        }

        System.out.println("Задание 3");

        for (int c = 0; c < 17; c = c + 2) {
            System.out.println("Итерация цикла 'c' " + c);
        }

        System.out.println("Задание 4");

        for (int d = 10; d >= -10; d = d - 1) {
            System.out.println("Итерация цикла 'd' " + d);
        }

        System.out.println("Задание 5");

        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " Год является високосным");
        }

        System.out.println("Задание 6");

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println("Итерация цикла ' f'" + f);
        }

        System.out.println("Задание 7-9");

        int toStorage = 29000;
        int total = 0;
        for (int g = 0; g < 12; g = g + 1) {
            total = total + toStorage / 100;
            System.out.println("Очередной месяц, сумма накоплений равна" + total + " рублей");
        }

        System.out.println("Задание 10");

        int factorOne = 2;
        int factorTwo = -2;
        for (int h = 1; h <= 11; h++) {
            factorTwo = factorTwo + 2;
            System.out.println(factorOne + " * " + h + " = " + factorTwo);
        }
    }
}
