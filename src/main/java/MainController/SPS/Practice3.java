package MainController.SPS;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        new Practice3().showPrimeNumbers();
    }

    void countPrimeNumbers() {
        int end;
        int count = 0;
        System.out.println("Input N");
        end = new Scanner(System.in).nextInt();
        for (int i = 0; i < Math.abs(end); i++) {
            if (Practice2.isPrime(Math.abs(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    void showPrimeNumbers() {
        int n;
        int number=1;
        int count = 1;
        System.out.println("Input N");
        n = new Scanner(System.in).nextInt();
        while (count <= n) {
            if(Practice2.isPrime(number)){
                System.out.print(number+ " ");
                count++;
            }
            number++;
        }
    }

    void bitomichSearch() {
        StringBuilder arrayResault = new StringBuilder("");
        System.out.println("Input array max number");
        int inputArray = new Scanner(System.in).nextInt();
        System.out.println("Search number");
        String s = new Scanner(System.in).nextLine();
        for (int i = 0; i < inputArray; i++) {
            arrayResault.append(i + " ");
        }
        for (int i = inputArray; i >= 0; i--) {
            arrayResault.append(i + " ");
        }
        System.out.println(arrayResault);
        System.out.println(arrayResault.toString().contains(s) ? "Число есть в массиве" : "");
    }
}

