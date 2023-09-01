package chapterThree;

import javax.swing.*;

public class Bright {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(sout("enter first number"));
        int secondNum = Integer.parseInt(sout("enter second number"));
        System.out.println(firstNum);
        int sum = firstNum+secondNum;
        display("the sum is "+ sum);
    }
    private static String sout(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}
