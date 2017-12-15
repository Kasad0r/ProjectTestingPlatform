package MainController.ShiselniMetodi;

import java.util.Scanner;

public class Work1 {
    static int x0 = -7;
    static int x1 = -5;
    static int x2 = -4;
    static int y0 = 4;
    static int y1 = -4;
    static int y2 = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(f(1));
    }

    static double f(int x) {
        return y0 * ((x - x1) * (x - x2)) / (x0 - x1) / (x0 - x2) + y1 * ((x - x0) * (x - x2)) / (x1 - x0) / (x1 - x2) +
                y2 * ((x - x0) * (x - x1)) / (x2 - x0) / (x2 - x1);
    }
}
