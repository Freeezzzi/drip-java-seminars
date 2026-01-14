public class Example2ConsoleOutput {
    public static void main(String[] args) {
        // println - выводит текст и переходит на новую строку
        System.out.println("Это выведено с помощью println()");
        System.out.println("Это появляется на новой строке");

        // print - выводит текст без перехода на новую строку
        System.out.print("Это выведено с помощью print() ");
        System.out.print("и это продолжается на той же строке");
        System.out.println(); // Пустой println для перехода на следующую строку

        // Вывод различных типов данных
        System.out.println("Целое число: " + 42);
        System.out.println("Число с плавающей точкой: " + 3.14);
        System.out.println("Булево значение: " + true);
        System.out.println("Символ: " + 'A');

        // Вывод с форматированием
        String name = "Java";
        int version = 21;
        System.out.println("Добро пожаловать в " + name + " " + version + "!");

        // Использование printf для форматированного вывода
        System.out.printf("Форматированный вывод: %s версия %d%n", name, version);

        System.out.println(); // Пустая строка для разделения

        // Форматирование чисел с плавающей точкой
        double pi = 3.14159265359;
        double price = 1234.5;

        // %f - вывод числа с плавающей точкой (по умолчанию 6 знаков после запятой)
        System.out.printf("Pi (по умолчанию): %f%n", pi);

        // %.2f - два знака после запятой
        System.out.printf("Pi (2 знака): %.2f%n", pi);

        // %.4f - четыре знака после запятой
        System.out.printf("Pi (4 знака): %.4f%n", pi);

        // %10.2f - всего 10 символов, из них 2 после запятой (выравнивание вправо)
        System.out.printf("Цена: %10.2f руб.%n", price);

        // Использование String.format для создания форматированной строки
        String formattedPrice = String.format("Итого к оплате: %.2f руб.", price);
        System.out.println(formattedPrice);
    }
}
