package chapterFive;

public class PatternB {
    public static void main(String[] args) {

        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.printf(" %d", j);
            }
            System.out.println();
        }
    }
}
