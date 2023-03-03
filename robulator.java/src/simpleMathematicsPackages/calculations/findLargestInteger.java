package simpleMathematicsPackages.calculations;

public class findLargestInteger {
    public int start(String listOfNumbers) {
        int largestNumber = 0;
        String[] inputNumberList = listOfNumbers.replaceAll(
                "\\s", "").split(",");

        for (String s : inputNumberList) {
            if (largestNumber <= Integer.parseInt(s)){
                largestNumber = Integer.parseInt(s);
            }
        }
        return largestNumber;
    }
}
