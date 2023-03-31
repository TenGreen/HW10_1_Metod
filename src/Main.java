import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1();
        task2();
        task3();

    }

    public static int enterNumberOfYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер года");
        int numberOfYear = scanner.nextInt();
        isLeapYear(numberOfYear);
        return numberOfYear;
    }

    public static void isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static int OSVersion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая у вас операционая система?");
        System.out.println("0 - Android, 1 - Ios");
        int ver = scanner.nextInt();
        return ver;
    }

    public static void recommendationForOSSelection(int year, int versionOS) {
        int currentYear = LocalDate.now().getYear();
        switch (versionOS) {
            case 1:
                if (year < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 0:
                if (year < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            default:
                System.out.println("Приложение для вашей операционной системы находится в разработке");
        }
    }

    public static int distans() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите растояние до офиса");
        int distans = scanner.nextInt();
        return distans;
    }

    public static void  deliveryTime(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance>100) {
            System.out.println("Доставка по вашему адресу производится по отдельной договоренности");
        } else {
            deliveryTime = (deliveryDistance/40 + 1);
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        isLeapYear(enterNumberOfYear());
    }

    public static void task2() {
        System.out.println("Задача 2");
        recommendationForOSSelection(enterNumberOfYear(), OSVersion());
    }

    public static void task3() {
        System.out.println("Задача 3");
        deliveryTime(distans());

    }
}
