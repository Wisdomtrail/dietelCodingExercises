package chapterFive;

public class PythagoreanTriple {
    public static void main(String[] args) {
        for (int sideA = 1; sideA <= 500; sideA++) {
            a:
            for (int sideB = sideA + 1; sideB <= 500; sideB++) {
                for (int sideC = sideB + 1; sideC <= 500; sideC++) {
                    if ((sideA * sideA) + (sideB * sideB) == sideC * sideC) {
                        System.out.println(sideA + " " + sideB + " " + sideC);
                        break a;
                    }
                }
            }
        }
    }
}

