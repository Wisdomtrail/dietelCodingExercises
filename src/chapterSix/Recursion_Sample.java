package chapterSix;

public class Recursion_Sample {
    public static void main(String[] args) {

        print_Right_Facing_Right_angled_Triangle(5);

    }

    private static void print_Right_Facing_Right_angled_Triangle(int number){
        if (number < 1) {
            return;
        }
        number = number -1;
        print_Right_Facing_Right_angled_Triangle(number);
        for (int index = number; index < 4; index++) {
            System.out.print(" ");
        }
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
