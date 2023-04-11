package chapterSix;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(IsPerfect(num));

    }
    private static String IsPerfect(int num) {
        int counter = 0;
        int ans = 0;
        while (ans < num) {
            counter += 1;
            ans += counter;

        }
       if (ans == num)
           return "perfect number";
        return "not a perfect number";
    }
}
