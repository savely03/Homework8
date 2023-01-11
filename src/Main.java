public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 8");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Task1:");
        int deposit = 0;
        int save = 15_000;
        int aim = 2_459_000;
        int month = 1;
        while (deposit < aim) {
            deposit += save;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + deposit + " рублей.");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Task2:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task3:");
        int population = 12_000_000;
        int year = 1;
        while (year <= 10) {
            population += population / 1000 * 9;
            System.out.println(" Год " + year + " численность населения составляет " + population + " человек.");
            year++;
        }
    }

    public static void task4() {
        System.out.println("Task4:");
        int sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum += sum * 0.07;
            System.out.println(" Месяц " + month + " сумма по вкладу составляет " + sum + " рублей.");
            month++;
        }
    }

    public static void task5() {
        System.out.println("Task5:");
        int sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum += sum * 0.07;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма по вкладу составляет " + sum + " рублей.");
            }
            month++;
        }
        System.out.println("Конечная сумма по вкладу - " + sum + " рублей.");
    }

    public static void task6() {
        System.out.println("Task6:");
        int sum = 15_000;
        int month = 1;
        int year = 1;
        while (year <= 9) {
            sum += sum * 0.07;
            if (month % 6 == 0) {
                System.out.println(" Год " + year + " Месяц " + month + " сумма по вкладу составляет " + sum + " рублей.");
            }
            if (month % 12 == 0) {
                month = 1;
                year++;
                continue;
            }
            month++;
        }
    }

    public static void task7() {
        int friday = 5;
        int dayOfMonth = 1;
        int dayOfWeek = 1;
        while (dayOfMonth <= 31) {
            if (dayOfWeek == friday) {
                System.out.println(" Сегодня пятница, " + dayOfMonth + " - число.");
            } else if (dayOfWeek == 7) {
                dayOfWeek = 0;
            }
            dayOfWeek++;
            dayOfMonth++;
        }
    }

    public static void task8() {
        System.out.println("Task8:");
        int initialYear = 2023;
        int startYear = initialYear - 200;
        int finishYear = initialYear + 100;
        while (startYear <= finishYear) {
            if (startYear % 79 == 0) {
                System.out.println(" " + startYear + " - год появления кометы.");
            }
            startYear++;
        }
    }
}