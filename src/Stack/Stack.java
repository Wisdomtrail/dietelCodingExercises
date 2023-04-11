package Stack;

public class Stack {

    private int count = 0;

    public void StackSize(int size){
    }

    public boolean isEmpty() {
        return count <= 0;
    }

    public void push(int element) {
      count+=1;
    }

    public void pop() {
        count-=1;
    }
}
