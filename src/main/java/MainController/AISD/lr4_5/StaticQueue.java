package MainController.AISD.lr4_5;

import java.util.Arrays;
import java.util.Scanner;

public class StaticQueue {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        boolean exit = true;
        StaticQueue staticQueue = null;
        Scanner sc = new Scanner(System.in);
        while (exit) {
            System.out.println("0.set queue length(delete all objects in queue)");
            System.out.println("1.enqueue");
            System.out.println("2.dequeue ");
            switch (sc.nextInt()) {
                case 0:{
                    System.out.print("Input length:");
                    staticQueue = new StaticQueue(sc.nextInt());
                }break;

                case 1:{
                    staticQueue.insert(sc.nextInt());
                    System.out.println(Arrays.toString(staticQueue.queue));
                }
                    break;
                case 2:
                    System.out.println(staticQueue.remove() + "REMOVED!");
                    System.out.println(Arrays.toString(staticQueue.queue));
                    break;
                default:
                    exit = false;
            }
        }
    }

    public StaticQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void insert(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem;
        nElem++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        queue[--front] = 0;
        nElem--;
        return temp;
    }
    public int getFront() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }

}
