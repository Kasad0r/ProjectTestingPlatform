package MainController;

public class PascalTriengular {
    public static void main(String[] args) {
        getPascal(500);
    }

    public static void getPascal(int length) {
        for (int n = 0; n < length + 1; n++) {
            int Cnk = 1;
            System.out.print(Cnk);
            for (int k = 1; k <= n; k++) {
                Cnk *= (n - k + 1);
                Cnk /= k;
                System.out.print(" ");
                System.out.print(Cnk);
            }
            System.out.println();
        }
    }
}
