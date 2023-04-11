package chapterSix;

public class Prime {
    public static void main(String[] args) {

        IsPrime(3);
    }
    private static void IsPrime(int a) {
        if(a % 3 == 2 || a%3 == 1){
            System.out.println("it is a prime number");
        }
        else System.out.println("it is not a prime number");
    }
}
