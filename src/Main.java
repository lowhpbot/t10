import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество товаров: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] товары = new String[count];
        int[] количества = new int[count];
        double[] стоимости = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Введите название товара " + (i + 1) + ": ");
            товары[i] = scanner.nextLine();

            System.out.print("Введите количество товара " + (i + 1) + ": ");
            количества[i] = scanner.nextInt();

            System.out.print("Введите стоимость товара " + (i + 1) + ": ");
            стоимости[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("Статистика товаров на складе:");
        double общаяСтоимость = 0;
        for (int i = 0; i < count; i++) {
            double стоимостьОстатка = количества[i] * стоимости[i];
            System.out.println(товары[i] + ": " + количества[i] + " шт. Стоимость остатка: " + стоимостьОстатка);
            общаяСтоимость += стоимостьОстатка;
        }

        System.out.println("Общая стоимость товаров на складе: " + общаяСтоимость);
    }
}