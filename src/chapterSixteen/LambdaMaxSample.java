package chapterSixteen;

import java.util.Arrays;

public class LambdaMaxSample {
    public static void main(String[] args) {
        int[] arr = new int[]{98, 13, 34, 13};
        int max = Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
        System.out.println(max);


    }
}
