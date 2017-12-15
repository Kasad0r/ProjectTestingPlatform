package MainController.ShiselniMetodi;
//-7 -5 -4 4 -4 5
import java.util.Scanner;

public class RungeKuti {
    private static int a = 0;
    private static int b = 5;
    private static double x;
    private static int n = 10;
    private static double h = (b - a) / n;
    private static double k1, k2, k3, k4, m1, m2, m3, m4;
    private static double[] y10 = new double[n];
    private static double[] y20 = new double[n];

    public static double y1 = Math.cos(x) / Math.pow(1 + Math.pow(Math.E, 2 * x), 0.5);

    public static double y2 = Math.sin(x) / Math.pow(1 + Math.pow(Math.E, 2 * x), 0.5);

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
         a = scanner.nextInt();
        System.out.println("Введите b");
         b = scanner.nextInt();
        giveResault();
    }





    public static double funcY1(double x, double y10, double y20) {

        return -y20 + y10 * (Math.pow(y10, 2) + Math.pow(y20, 2) - 1);
    }

    public static double funcY2(double x, double y1, double y2) {
        return y1 + y2 * (Math.pow(y1, 2) + Math.pow(y2, 2) - 1);
    }

    static void giveResault() {
        y10[0] = 1 / Math.sqrt(2);
        y20[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            x = i * h;

            k1 = h * funcY1(x, y10[i], y20[i]);
            m1 = h * funcY2(x, y10[i], y20[i]);

            k2 = h * funcY1(x + h / 2, y10[i] + k1 / 2, y20[i] + k1 / 2);
            m2 = h * funcY2(x + h / 2, y10[i] + m1 / 2, y20[i] + m1 / 2);

            k3 = h * funcY1(x + h / 2, y10[i] + k2 / 2, y20[i] + k2 / 2);
            m3 = h * funcY2(x + h / 2, y10[i] + m2 / 2, y20[i] + m2 / 2);

            k4 = h * funcY1(x + h, y10[i] + k3, y20[i] + k3);
            m4 = h * funcY2(x + h, y10[i] + m3, y20[i] + m3);

            y10[i + 1] = y10[i] + h * (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            y20[i + 1] = y20[i] + h * (m1 + 2 * m2 + 2 * m3 + m4) / 6;

            System.out.println("| " + x + " |" + " " + y10[i] + " " + "|" + " " + y20[i] + " " + "|");
        }
    }
}
