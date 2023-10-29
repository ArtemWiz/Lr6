import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nummer 2
        double startX = -2.0;
        double endX = 4.0;
        double step = 0.3;

        System.out.println("x\t| y");
        System.out.println("--------------");

        for (double x = startX; x <= endX; x += step) {
            double y = Math.pow(Math.sin(x), 2) + x / 2;
            System.out.printf("%.2f\t| %.2f\n", x, y);
        }

        //Nummer 3
        Scanner scanner = new Scanner(System.in);

        int input;
        StringBuilder result = new StringBuilder();

        do {
            System.out.print("Введіть число (0 для завершення): ");
            input = scanner.nextInt();

            if (input >= 65 && input <= 90) { // Перевірка, чи код належить великим латинським літерам
                char letter = (char) input; // Перетворення коду в символ
                result.append(letter);
            }
        } while (input != 0);
        System.out.println("Результат: " + result.toString());
        scanner.close();


    }
}