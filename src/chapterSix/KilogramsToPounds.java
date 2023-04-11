package chapterSix;

public class KilogramsToPounds {
    public static void main(String[] args) {
        int count = 1;
        while (count < 200){
            System.out.printf("""
                    Kilograms          Pounds
                    %d                   %.1f 
                    
                    """, count, count*2.2);
            count++;
        }
    }
}
