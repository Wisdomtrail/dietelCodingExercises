package chapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class MbtiTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Is Your Name");
        String name = scanner.nextLine();

        String[] question = new String[5];
        int length = question.length;
        question[0] = "1.  A. tough-minded, just           B. tender-hearted, merciful";
        question[1] = "2.  A. Candid, straight forward, frank          B. tactful, kind, encouraging";
        question[2] = "3.  A. focus on here-and-now          B. look to the future, global perspective, big picture";
        question[3] = "4.  A. control, govern          B. latitude, freedom";
        question[4] = "5.  A. standard, usual, conventional          B. different, novel, unique";
        String answer;
        int i = 0;
        String[] answers = new String[5];
        do {
            System.out.println(question[i]);
            answer = scanner.nextLine();

            while (!Objects.equals(answer, "a") && !Objects.equals(answer, "b")){
                System.out.println("Expected a or b as response");
                System.out.println("I know this is an error please try again");
                System.out.println(question[i]);
                answer = scanner.nextLine();
            }
            answers[i] = answer;
            i+=1;
        }
        while (i < length);
        System.out.printf("Hello %s you selected%n ",name);
        if (Objects.equals(answers[0], "a")){
            System.out.println("A. tough-minded, just");
        }
        else System.out.println("B. tender-hearted, merciful");

        if (Objects.equals(answers[1], "a") || Objects.equals(answers[1], "A")){
            System.out.println("A. Candid, straight forward, frank");
        }
        else System.out.println("B. tactful, kind, encouraging");
        if (Objects.equals(answers[2], "a") || Objects.equals(answers[2], "A"));
    }
}
