package chapterFive;

public class DivisibleByThree {
    public static void main(String[] args) {
        int result = 0;
        int var = 30;
        while (var >= 1){
         if (var%3 == 0){
             System.out.printf(" %d%n",var);
             result+=var;
         }
            var--;
        }
        System.out.printf("sum is %d",result);

        int i = 2;
    }
}
