package Array;
import java.util.ArrayList;
public class ArrayMedian {
    public static void main(String[] args) {
        System.out.println(medianOfTwoSortedArrays(new int[]{1,2,3,4}, new int[]{1,2}));
    }

    public static Double medianOfTwoSortedArrays(int[] array1, int[] array2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            arrayList.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            arrayList.add(array2[i]);
        }

        double sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum+=arrayList.get(i);
        }
        double answer = sum/arrayList.size();
        return answer;
    }
}
