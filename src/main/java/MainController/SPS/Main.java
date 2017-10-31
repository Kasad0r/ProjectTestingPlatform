package MainController.SPS;

import java.util.Arrays;

/*
*  Змістити 5 елемент массиву в 1 */
//нулі в перед массива
public class Main {
    static int arr[] = {1, 3, 2, 5, 3, 1, 65, 8, 4, 0, 0, 0, -5};

    public static void main(String[] args) {
       zeroToStart();

    }

    static void move5to1() {
        if (arr.length > 5) {
            arr[0] += arr[5];
            arr[5] = arr[0] - arr[5];
        }
    }

    static void zeroToStart() {
        int cout = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp = arr[cout];
                arr[cout] = 0;
                arr[i] = temp;
                cout++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void sum() {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a += arr[i];
        }
        System.out.println(a);
    }

    static void sort(int arr[]) {
        int arrLength = arr.length;
        int temp = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 1; j < (arrLength - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swapStartEnd() {
        int start = 0;
        int end = arr.length;
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
