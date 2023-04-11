package chapterSix;

import java.security.SecureRandom;

public class Frequency {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        double frequency1 = 0;
        double frequency2 = 0;
        double frequency3 = 0;
        double frequency4 = 0;
        double frequency5 = 0;
        for (int i = 0; i < 90; i++) {
            int num = secureRandom.nextInt(1,6);
            if(num == 1){
                frequency1+=1;
            }
            if (num == 2){
                frequency2+=1;
            }
            if (num == 3) {
                frequency3 += 1;
            }
            if (num == 4){
                frequency4+=1;
            }
            if(num == 5){
                frequency5+=1;
            }
        }
        System.out.printf("""
                face        frequency
                1               %.0f
                2               %.0f
                3               %.0f
                4               %.0f
                5               %.0f""",frequency1, frequency2,frequency3,frequency4,frequency5);
    }
}
