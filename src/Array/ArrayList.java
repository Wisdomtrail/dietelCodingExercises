package Array;

public class ArrayList implements List {
    private int number[];
    private int count = 0;
    private Boolean empty = true;
    public ArrayList(int arraySize){
        number = new int[arraySize];
    }
    @Override
    public boolean isEmpty() {
      return empty;
    }

    @Override
    public void add(int i) {
        count++;
        if (count > 0){
            empty = false;
        }
    }

    @Override
    public void remove(int i) {
        count--;
        if (count < 1){
            empty = true;
        }
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public int get(int i) {
        return 0;
    }

    @Override
    public int getIndexOf(int i) {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}