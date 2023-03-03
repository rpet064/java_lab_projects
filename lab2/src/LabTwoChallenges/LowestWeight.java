package LabTwoChallenges;
public class LowestWeight {
    //    This class takes two weights and returns the lightest weight
    public static void start() {
        GetInput getInput = new GetInput();
        double weightOne  = Double.parseDouble(getInput.start("Please enter your first weight in kgs"));
        double weightTwo  = Double.parseDouble(getInput.start("Please enter your second weight in kgs"));
        System.out.println("The lightest weight is: " + Math.min(weightOne,weightTwo) + "kgs");

        }
    }
