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


    }
}