package MainController;

import java.util.Arrays;
        import java.util.InputMismatchException;
        import java.util.Random;
        import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        boolean choose = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                Scanner sc = new Scanner(System.in);
                Random random = new Random();
                int a, b, c, d, e, f, min, max;
                int z, g, q, tmp;
                System.out.println("Введите количество элементов массива:");
                int m = scanner.nextInt();
                if (m > 0) {
                    int arr[] = new int[m];
                    System.out.println("Выберите как заполнять массив:");
                    System.out.println("1.Самостоятельно.");
                    System.out.println("2.Автоматическое заполнение массива.");
                    System.out.println("3.Выход.");
                    a = scanner.nextInt();
                    if (a == 1) {
                        for (int i = 0; i < m - 1; i++) {
                            arr[i] = sc.nextInt();
                        }
                    } else if (a == 2) {
                        System.out.println("1.Указать свой диапазон случайных чисел." + "\n" + "2.Стандартный диапазон.");
                        b = scanner.nextInt();
                        switch (b) {
                            case 1:
                                System.out.println("Введите диапазон:");
                                System.out.print("От минус:");
                                c = scanner.nextInt();
                                System.out.print("До:");
                                d = scanner.nextInt();
                                d = d + c;
                                for (int i = 0; i < m - 1; i++) {
                                    arr[i] = random.nextInt(d) - c;
                                }
                                break;
                            case 2:
                                for (int i = 0; i < m - 1; i++) {
                                    arr[i] = random.nextInt(200) - 100;
                                }
                                break;
                        }
                    } else {
                        break;
                    }
                    System.out.println(Arrays.toString(arr));
                    System.out.println("Действия с массивом:" + "\n" + "1.Нахождение максимума/минимума;" + "\n" + "2.Сортировка;" + "\n" + "3.Выход.");
                    e = scanner.nextInt();
                    if (e == 1) {
                        System.out.println("1.Минимум;" + "\n" + "2.Максимум;" + "\n");
                        f = scanner.nextInt();
                        if (f == 1) {
                            min = arr[0];
                            for (int i = 0; i < m - 1; i++) {
                                if (min > arr[i])
                                    min = arr[i];
                            }
                            System.out.println(min);
                            System.out.println("Хотите повторить программу?" + "\n" + "1.Да" + "\n" + "2.Нет");
                            q = scanner.nextInt();
                            if (q == 1) {
                                choose = true;
                            } else {
                                choose = false;
                            }
                        } else if (f == 2) {
                            max = arr[0];
                            for (int i = 0; i < m - 1; i++) {
                                if (max < arr[i])
                                    max = arr[i];
                            }
                            System.out.println(max);
                            System.out.println("Хотите повторить программу?" + "\n" + "1.Да" + "\n" + "2.Нет");
                            q = scanner.nextInt();
                            if (q == 1) {
                                choose = true;

                            } else {
                                choose = false;
                            }
                        }
                    } else if (e == 2) {
                        System.out.println("Выберите способ сортировки:");
                        System.out.println("1.Обычная сортировка" + "\n" + "2.Пузырьковый метод");
                        z = scanner.nextInt();
                        if (z == 1) {
                            Arrays.sort(arr);
                            System.out.println(Arrays.toString(arr));
                            System.out.println("Хотите повторить программу?" + "\n" + "1.Да" + "\n" + "2.Нет");
                            q = scanner.nextInt();
                            if (q == 1) {
                                choose = true;
                            } else {
                                choose = false;
                            }
                        } else if (z == 2) {
                            System.out.println("Выберите сортировку:" + "\n" + "1.По возростанию." + "\n" + "2.По убыванию.");
                            g = scanner.nextInt();
                            if (g == 1) {
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < m - i - 1; j++) {
                                        if (arr[j] > arr[j + 1]) {
                                            tmp = arr[j];
                                            arr[j] = arr[j + 1];
                                            arr[j + 1] = tmp;
                                        }
                                    }
                                }
                                System.out.println(Arrays.toString(arr));
                                System.out.println("Хотите повторить программу?" + "\n" + "1.Да" + "\n" + "2.Нет");
                                q = scanner.nextInt();
                                if (q == 1) {
                                    choose = true;
                                } else {
                                    choose = false;
                                }
                            } else {
                                for (int i = 0; i < m; i++) {
                                    for (int j = 0; j < m - i - 1; j++) {
                                        if (arr[j] < arr[j + 1]) {
                                            tmp = arr[j];
                                            arr[j] = arr[j + 1];
                                            arr[j + 1] = tmp;
                                        }
                                    }
                                }
                                System.out.println("Хотите повторить программу?" + "\n" + "1.Да" + "\n" + "2.Нет");
                                q = scanner.nextInt();
                                if (q == 1) {
                                    choose = true;
                                } else {
                                    choose = false;
                                }
                            }
                            System.out.println(Arrays.toString(arr));
                        }
                    } else {
                        break;
                    }
                } else System.out.println("Ты петух");
            } catch (InputMismatchException e) {
                System.out.println("Ввод символа, запустите программу заново и вводите числа.");
            } catch (Exception e) {
                System.out.println("Exception");
            } finally {
                System.out.println("Close programm");
            }
        } while (choose == true);
    }
}