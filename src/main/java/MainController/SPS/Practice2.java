package MainController.SPS;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
       getPascal(10);

    }
    void getPrise2Numbers(){
        int start = 0;
        int end = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length");
        System.out.println("for");
        start = scanner.nextInt();
        System.out.println("end");
        end = scanner.nextInt();
        int arr[] = new int[end - start];
        for (int i = start; i < end; i++) {
            arr[index] = i;
            index++;
        }
        int last = 0;
        boolean firstTime = true;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (isPrime(arr[i])) {
                if (firstTime) {
                    last = i;
                    firstTime = false;
                }
                if (i > 1) {
                    if (arr[i] - arr[last] == 2) {
                        System.out.print("\t[" + arr[last] + "   ");
                        System.out.println(arr[i] + "]");
                    }
                    last = i;
                }
            }
        }
    }
    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
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
