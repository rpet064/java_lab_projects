package simpleMathematicsPackages.calculations;

public class findSmallerInteger {
    public int start(String listOfNumbers) {
        int smallestNumber = 100000000;
        String[] inputNumberList = listOfNumbers.replaceAll(
                "\\s", "").split(",");

        for (String s : inputNumberList) {
            if (smallestNumber >= Integer.parseInt(s)){
                smallestNumber = Integer.parseInt(s);
            }
        }
        return smallestNumber;
    }
}
