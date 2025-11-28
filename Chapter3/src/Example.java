public class Example {
    public static void countdown(int number) {
        if (number <= 0) {
            System.out.println("Старт!");
            return;
        }
        System.out.println(number);
        countdown(number - 1);
    }
    public static void main(String[] args) {
        System.out.println("Обратный отсчёт:");
        countdown(10);
    }
}