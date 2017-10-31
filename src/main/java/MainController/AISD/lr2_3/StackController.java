package MainController.AISD.lr2_3;

public class StackController {
    private int size;
    static private int[] stackArr;
    private int top = -1;
    private boolean updateArray = false;

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
        if(updateArray)
        updateStackSize();
        stackArr[top] = i;
    }

    void updateStackSize() {
        if (top == stackArr.length - 1) {
            int stackTemp[] = stackArr;
            stackArr = new int[(stackTemp.length * 3) / 2 + 1];
            System.arraycopy(stackTemp, 0, stackArr, 0, stackTemp.length);
        }
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
        stackArr[top]=0;
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

    public boolean isUpdateArray() {
        return updateArray;
    }

    public void setUpdateArray(boolean updateArray) {
        this.updateArray = updateArray;
    }
}























































































































































































































































































































































/**
 * done by kasad0r
 **/