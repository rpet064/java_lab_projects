package simpleMathematicsPackages.calculations;

public class convertTotalDaysIntoWeeksAndDays {
    public static void start(int days) {
        int weeks = days / 7;
        int leftOverDays = days % 7;
        System.out.println("Those days can be broken down into: " + weeks + " weeks and " + leftOverDays + " days.");
    }
}
