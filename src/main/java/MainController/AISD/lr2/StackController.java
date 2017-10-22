package MainController.AISD.lr2;

public class StackController {
    private int size;
    private int[] stackArr;
    private int top = -1;

    public StackController(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    /**
     * increment the ctr and push element into stack
     *
     * @param i element to be pushed
     *          created by Kasad0r
     */
    public void push(int i) {
        top++;
        System.out.println("Pushing " + i);
        stackArr[top] = i;
    }

    /**
     * pop the element from stack and decrement the ctr
     *
     * @return the popped element
     */
    public int pop() {
        int i = stackArr[top];
        top--;
        System.out.println("Popping " + i);
        return i;
    }

    public int top() {
        System.out.println("Peek " + stackArr[top]);
        return stackArr[top];
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public Integer size() {
        return stackArr.length;
    }

    public void swap() {
        int i = stackArr[top];
        stackArr[top] = stackArr[top - 1];
        stackArr[top - 1] = i;
    }

    public void clear() {
        stackArr = new int[this.size];
    }

    public int[] getStackArr() {
        return stackArr;
    }
}

















































































































































































































































































/**
 done by kasad0r
 **/