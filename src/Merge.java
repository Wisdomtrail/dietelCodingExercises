import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] num2 = {1,2, 3,3};
        int[] answer = mergeArray(num,num2);
        System.out.println(Arrays.toString(answer));
    }


    public static  int[] mergeArray(int[] num1, int[] num2){
        int[] answer = new int[num1.length+num2.length];
        int[] finalArray = new int[answer.length];
        int count = num1.length;
        for (int i = 0; i < num1.length; i++) {
            answer[i] = num1[i];
        }
        for (int i : num2) {
            answer[count++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}
