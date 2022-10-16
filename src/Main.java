public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }
        //Задание 3
        System.out.println("Задание 3");
        for (int b = 0; b <= 17; b = b + 2)
            System.out.println(b);
        //Задание 4
        System.out.println("Задание 4");
        for (int c = 10; c > -11; c--) {
            System.out.println(c);
        }
        //Домашнее задание 1.2
        System.out.println("Задание 1.2");
        for (int d = 1904; d <= 2096; d= d+4) {
            System.out.println(d+" год является високосным");
        }
        //Задание 2
        System.out.println("Задание 2.2");
        for (int e = 7; e <= 98; e = e+7) {
            System.out.println(e);
        }
        //Задание 3
        System.out.println("Задание 3.3");
        for (int f = 1; f <= 512; f = f * 2)
            System.out.println(f);
     //Домашнее задание 1.3
        System.out.println("Задание 1.3");
        int capital = 29000;
        int total = 0;
        for (int m =1; m <= 12; m++){
            total = total + capital;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total +" рублей");
        }
        System.out.println("Задание 2.3");
        int storage = 29000;
        int full = 0;
        for (int m =1; m <= 12; m++){
            full = full + full/100;
            full = full + storage;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + full +" рублей");
        }
    }
}