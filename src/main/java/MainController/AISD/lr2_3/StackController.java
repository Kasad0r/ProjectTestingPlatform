package MainController.AISD.lr2_3;

public class StackController {
    private int size;                                              //Размер стэка
    static private int[] stackArr;
    private int top = -1;                                          //Верхушка Стека
    private boolean updateArray = false;                           //Автоматическое разширение массива

    public StackController(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    /**
     * Внесение обьекта в верхушку стэка
     * Увеличние top на 1 позицию
     * Если разрешено updateArray , увеличивает массив автоматически
     */
    public void push(int i) {
        top++;
        System.out.println("Pushing " + i);
        if (updateArray)
            updateStackSize();
        stackArr[top] = i;
    }

    /**
     * проверяет нужно ли увеличивать массив
     * если true , копирует массив в временный массив
     * увеличивает основной массив  по формуле удаляя все обьекты
     * копирует с временного массива все обьекты в основной
     */
    void updateStackSize() {
        if (isFull()) {
            int stackTemp[] = stackArr;
            stackArr = new int[(stackTemp.length * 3) / 2 + 1];
            System.arraycopy(stackTemp, 0, stackArr, 0, stackTemp.length);
        }
    }

    /**
     * берет элемент с индекса top и заносит в временную переменную.
     * Уменьшает top на 1 позицию тк мы забрали элемент
     * Присваивает элементу по индексу top нулевое значение (пустое значение в массивах)
     *
     * @return возвращает элемент который нахоидся в вверхуше стэка
     */
    public int pop() {
        int i = stackArr[top];
        top--;
        System.out.println("Popping " + i);
        stackArr[top] = 0;
        return i;
    }

    /**
     * @return возвращает элемент верхушки стэка без удаления элемента со стэка
     */
    public int top() {
        System.out.println("Peek " + stackArr[top]);
        return stackArr[top];
    }

    /**
     * Проверка на переполненость массива
     *
     * @return если переполнен возвращает true
     */
    public boolean isFull() {
        return (top == size - 1);
    }

    /**
     * Проверка на пустой массив ,
     * исключенния ошибок IndexOutOfBoundsException
     *
     * @return true если пуст
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * @return Возвращает размер массива
     */
    public Integer size() {
        return stackArr.length;
    }

    /**
     * меняет местами 2 последних элемента стэка
     */
    public void swap() {
        int i = stackArr[top];
        stackArr[top] = stackArr[top - 1];
        stackArr[top - 1] = i;
    }

    /**
     * Удаляет все элементы стэка
     */
    public void clear() {
        stackArr = new int[this.size];
    }

    public int[] getStackArr() {
        return stackArr;
    }


    public void setUpdateArray(boolean updateArray) {
        this.updateArray = updateArray;
    }
}


