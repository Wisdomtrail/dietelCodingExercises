package chapterSix;

public class Digits {
    public static void main(String[] args) {
        SumOfDigit(7631);

    }
    private static void SumOfDigit(int a){

        int b = a/1000;
        int c = a%1000;
        int d = c/100;
        int e = c%100;
        int f = e/10;
        int g = a%10;

        System.out.printf(" %d", b+d+f+g);
    }
}
