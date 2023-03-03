package LabTwoChallenges;
import java.util.Scanner;

public class GetInput {
    public static String start(String printText) {
        Scanner inputOj = new Scanner(System.in);
        System.out.println(printText);
        return inputOj.nextLine();
    }
}
