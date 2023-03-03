package simpleMathematicsPackages;
import simpleMathematicsPackages.calculations.*;
import java.util.concurrent.TimeUnit;

public class simpleMathematics {
    public static void main(String[] args) throws InterruptedException {

        printOptions printOptions = new printOptions();
        getUserInput getUserInput = new getUserInput();

        System.out.println("Welcome to the Robulator - Java Edition");
        TimeUnit.SECONDS.sleep(2);
        printOptions.start();

        String userInput = getUserInput.start("What calculation would you like to do today?");

        switch (userInput) {
            case "1":
                convertCelsiusToFahrenheit convertCelsiusToFahrenheit = new convertCelsiusToFahrenheit();

                String userInputCelsius = getUserInput.start("Please input your celsius degrees to be converted");
                float celsius = Float.parseFloat(userInputCelsius);
                System.out.println("The Fahrenheit is: " + convertCelsiusToFahrenheit.start(celsius));
                break;

            case "2":
                String userInputDays = getUserInput.start("Please input your days to be converted");
                int days = Integer.parseInt(userInputDays);
                convertTotalDaysIntoWeeksAndDays.start(days);
                break;

            case "3":
                findSmallerInteger findSmallerInteger = new findSmallerInteger();

                String userInputListOfNumbers = getUserInput.start("Please input your numbers with a comma");
                System.out.println("The smallest number is " + findSmallerInteger.start(userInputListOfNumbers));
                break;

            case "4":
                getCompoundInterestValue getCompoundInterestValue = new getCompoundInterestValue();

                String annualInterestRate = getUserInput.start("What is your interest rate");
                String investmentInYears = getUserInput.start("How many years would you like to invest for?");
                String initialInvestment = getUserInput.start("How much money are you saving initially?");
                float annualInterestRateFloat = Float.parseFloat(annualInterestRate);
                float investmentInYearsFloat = Float.parseFloat(investmentInYears);
                float initialInvestmentFloat = Float.parseFloat(initialInvestment);
                System.out.println("You will be able to save: $" +
                        getCompoundInterestValue.start(
                                annualInterestRateFloat, investmentInYearsFloat, initialInvestmentFloat)
                        + " after " + investmentInYears + " years.");
                break;

            case "5":
                getMyBMI getMyBMI = new getMyBMI();

                String userInputKilograms = getUserInput.start("Please input your weight (in kilograms)");
                String userInputHeight = getUserInput.start("Please input your height (in metres)");
                float userInputKilogramsFloat = Float.parseFloat(userInputKilograms);
                float userInputHeightFloat = Float.parseFloat(userInputHeight);
                System.out.println("Your BMI is: " + getMyBMI.start(userInputKilogramsFloat, userInputHeightFloat));
                break;

            case "6":
                getSphereVolume getSphereVolume = new getSphereVolume();

                String userInputRadius = getUserInput.start("Please input your sphere's radius (in centimetres)");
                float userInputRadiusFloat = Float.parseFloat(userInputRadius);
                System.out.println("Your sphere's cubic volume is: " + getSphereVolume.start(userInputRadiusFloat));
                break;

            case "7":
                kilogramsToPounds kilogramsToPounds = new kilogramsToPounds();

                String userInputWeight = getUserInput.start("Please input your weight (in kilograms)");
                float kilograms = Float.parseFloat(userInputWeight);
                System.out.println("Your Weight in pounds is: " + kilogramsToPounds.start(kilograms));
                break;

            case "8":
                findLargestInteger findLargestInteger = new findLargestInteger();

                String userInputListOfNumber = getUserInput.start("Please input your numbers with a comma");
                System.out.println("The largest number is " + findLargestInteger.start(userInputListOfNumber));
                break;
        }
    }
}