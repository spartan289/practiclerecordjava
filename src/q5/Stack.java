package q5;

public class Stack {
    private int tos;
    private int[] array;
    final private int size;

    public Stack(int size) {
        this.tos = -1;
        this.size = size;
        this.array = new int[this.size];

    }

    //Push an element on top of a stack

    public void push(int e) throws StackException {
        if(tos == size-1)
            throw new StackException("Stack OverFlow: could not push "+e);
        else
            this.array[++this.tos] = e;

    }
    //Pop an element from the stack
    public int pop() throws StackException {
        if(this.tos<0){
            throw new StackException("Stack Underflow: could not pop");
        }else
            return this.array[this.tos--];
    }
    public int getTos() {
        return this.tos;
    }

    public String toString() {
        return "Stack<size="+this.size+">";
    }
}
