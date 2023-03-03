package simpleMathematicsPackages;
import java.util.Scanner;

public class getUserInput {

    public String start(String args) {
        Scanner userInputObj = new Scanner(System.in);
        System.out.println(args);
        return userInputObj.nextLine();
    }
}
