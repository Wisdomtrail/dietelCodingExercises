package chapterSix;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double r = DistanceBetweenTwoPoints(3,2,13,3);
        System.out.println(r);
    }
    private static int DistanceBetweenTwoPoints(int x1,int Y1, int X2, int Y2){
        int first = (int) (Math.pow((X2-x1),2) - Math.pow((Y2-Y1),2));
        return (int) Math.sqrt((first));
    }
}
