package MainController.SPS;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int arr[] = {1, -1, 2, -2, 2, 3, 3, 9};

        searchArea(4);
    }

    static void zeroToStart(int arr[]) {
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

    static void samePareofNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < (arr.length); j++) {
                if (arr[j] + arr[i] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
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

    static void sameNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < (arr.length); j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void same4Numbers0(int arr[]) {
        int arrLength = arr.length;
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < (arrLength); j++) {
                for (int k = j + 1; k < (arrLength); k++) {
                    for (int l = k + 1; l < (arrLength); l++) {
                        if ((arr[l] + arr[k] + arr[j] + arr[i]) == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    static void searchArea(int area) {
        int arrArea[] = new int[area];
        for (int i = 0; i < arrArea.length; i++) {
            arrArea[i] = i + 1;
        }
        for (int i = 0; i < arrArea.length; i++) {
            for (int j = i + 1; j < arrArea.length; j++) {
                if (arrArea[i] * arrArea[j] == area && arrArea[i] > 0 && arrArea[j] > 0)
                    System.out.println(arrArea[i] + " " + arrArea[j]);
            }
        }
    }
}

