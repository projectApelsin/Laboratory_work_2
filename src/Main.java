import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер числа Фибоначчи: ");
        int n = scanner.nextInt();
        System.out.println("Число Фибоначчи №" + n + " равно: " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
