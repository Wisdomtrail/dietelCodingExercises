package chapterFive;

public class PatternD {
    public static void main(String[] args) {
        int blank = 6;
        for (int i = 1; i <= 7; i+=1) {
            for (int k = 0; k < blank; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.printf(" %d",j);
            }
            System.out.println();
            blank--;
        }
    }
}
