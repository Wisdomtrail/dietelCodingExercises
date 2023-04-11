package chapterSix;

public class Weather {
    public static void SportRecommender(int temp) {

        if (temp <= 30 && temp >= 20) {
            System.out.println("It’s reasonable weather for sports today");
        } else if (temp <= 40 && temp >= 10) {
            System.out.println("Please exercise with care today, watch out for the weather!");
        }

    }
}
