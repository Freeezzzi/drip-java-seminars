import java.util.Scanner;

/**
 * Пример 3: Ввод данных из консоли с помощью Scanner
 * <p>
 * Этот пример демонстрирует, как считывать пользовательский ввод из консоли.
 */
public class Example3ConsoleInput {
    public static void main(String[] args) {
        // Создаём объект Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Чтение строки (полной строки)
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");

        // Чтение целого числа
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Вам " + age + " лет.");

        // Чтение числа с плавающей точкой
        System.out.print("Введите ваш рост в формате (1.65): ");
        double height = scanner.nextDouble();
        System.out.println("Ваш рост " + height + "  метров .");

        // Чтение одного слова
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите ваш любимый язык программирования: ");
        String language = scanner.next();
        System.out.println("Вам нравится " + language + "!");

        // Закрываем scanner
        scanner.close();
        System.out.println("\nПрограмма завершена!");
    }
}
