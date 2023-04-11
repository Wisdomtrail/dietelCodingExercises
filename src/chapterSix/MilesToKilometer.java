package chapterSix;

public class MilesToKilometer {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.printf("""
                    Miles        Kilometers 
                    %d             %.3f
                    """, count, count * 1.609);

            count++;
        }
    }
}
