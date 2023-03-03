package LabTwoChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RemoveChar {
//    this programme takes a string and then returns the string
//    missing a random character
    public static void start()
    {
        GetInput getInput = new GetInput();
        String inputText = getInput.start("Please insert a word or phrase: ");
        List<String> inputTextList = Arrays.asList(inputText.split(""));

        System.out.println("Shuffling List");
        Collections.shuffle(inputTextList);

        int maxNum = inputTextList.size();
        int pos = ThreadLocalRandom.current().nextInt(0, maxNum + 1);
        System.out.println("Removing: " + inputTextList.get(pos) + " from list");

        int i = 0;
        StringBuilder newString = new StringBuilder();
        System.out.println(inputTextList);
        for (String character : inputTextList)
        {
            if (i != pos){
                newString.append(character);
            }
            i++;

        }
        System.out.println("Here is the new list: " + newString);
    }
}
