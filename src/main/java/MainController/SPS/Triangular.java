package MainController.SPS;

import java.io.IOException;
import java.util.Scanner;

public class Triangular {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите количество строк: ");
        int size = in.nextInt();


        int i = 1;
        while (i <= size) {
            int j = size;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            int k = i;
            while (k > 0) {
                System.out.print("" + k);
                k--;

            }


            i++;
            System.out.println("");

        }


        int s = size - 1;
        while (s >= 1) {
            int j = size;
            while (j >= s) {
                j--;
                System.out.print(" ");
            }
            int k = s + 1;
            while (k > 1) {
                k--;
                System.out.print("" + k);
            }
            s--;
            System.out.println();
        }

        in.close();
    }

}