package LabTwoChallenges;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersInARange {
//    This programme takes a range of numbers, then randomly generates
//    and returns three numbers within the range and determines the smallest
//    number in the range
    public static void start() {
        GetInput getInput = new GetInput();
        int minNum  = Integer.parseInt(getInput.start("What's the minimum number in your range?"));
        int maxNum  = Integer.parseInt(getInput.start("What's the maximum number in your range?"));
        int reps  = Integer.parseInt(getInput.start("How many random numbers do you want to generate"));

        int randomNum;
        int[] intArray = new int[reps];

        for (int i = 0; i < reps; i++){
            randomNum = ThreadLocalRandom.current().nextInt(minNum, maxNum + 1);
            intArray[i] = randomNum;

        }
        Arrays.sort(intArray);
        System.out.println("Here is your sorted array of numbers" + Arrays.toString(intArray));
    }
}
