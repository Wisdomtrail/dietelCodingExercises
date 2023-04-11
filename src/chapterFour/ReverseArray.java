package chapterFour;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 12;
        array[2] = 3;
        array[3] = 4;

        int[] newArray = new int[4];
        int count = 0;
        for (int i = 3; i >= 0 ; i--) {
           newArray[i] = array[count];
            System.out.println(newArray[count]);
            count+=1;
        }

    }

}
