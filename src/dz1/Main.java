package dz1;

import java.util.Scanner;
//Д/з: создать приложение запрашивающее у пользователя наименование товара, количество, телефон пользователя и адрес.
// В консоль выводит информацию о заказе, в виде: Ваш заказ принят.
// Товар <Наименование товара> в количестве <количество> прибудет к вам в ближайшее время.
// Товар доставим по адресу: <адрес>. Ваш контактный номер: <телефон>.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество товара: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        String phone = scanner.nextLine();
        System.out.print("Введите aдрес доставки: ");
        String address = scanner.nextLine();
        System.out.printf("Ваш заказ принят.Товар %s в количестве %d прибудет к вам в ближайшее время.\n" +
                "Товар доставим по адресу: %s. Ваш контактный номер: %s.", name, count, address, phone);
        scanner.close();
    }
}