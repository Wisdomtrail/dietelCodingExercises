import java.util.Arrays;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int[] array =  lcmMethod(num);
        System.out.println(Arrays.toString(array));
    }

    public static int[] lcmMethod(int num){
        int divider = 2;
        int[] array = new int[num/2];
        int count = 0;

        while (num > 1){
            if (num%divider == 0){
                num = num/divider;
                array[count] = (divider);
                count++;
            }
            else {
                divider++;
            }
        }
        int counter = 0;
        int[] newArray = new int[count];
        for (int j:array) {
            if (j > 0){
                newArray[counter] = j;
            }
            counter++;
        }

        return newArray;
    }
}
