package chapterSeven;

public class Average{
    public static void main(String[] args) {
        System.out.println(Average.average(1, 2, 3,4,5,6,7,8,9,10));
    }

    private static String average(int...numbers){
        int sum = 0;
        int answer = 0;
        for (int number : numbers) {
            sum += number;
        }
        answer+= sum / numbers.length;
        return "Average of all the numbers is " + answer;
    }
}
