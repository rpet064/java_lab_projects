package simpleMathematicsPackages.calculations;

public class getCompoundInterestValue {
    public float start(float annualInterestRate, float investmentInYears, float initialInvestment) {

        return (float) (Math.pow((1 + annualInterestRate), investmentInYears)) * initialInvestment;
    }
}
