package simpleMathematicsPackages;
import java.util.concurrent.TimeUnit;

public class printOptions {

    public void start() throws InterruptedException {
        System.out.println("Choose a calculation from the list below");
        TimeUnit.SECONDS.sleep(2);

        String options =  String.join(
                        "Celsius to Fahrenheit (1) \n",
                        "Total Days to Weeks (2) \n",
                        "Find the smallest number (3) \n",
                        "Get the Compound Interest (4) \n",
                        "Get your BMI (5) \n",
                        "Get the volume of a sphere (6) \n",
                        "Change kilograms to pounds (7) \n",
                        "Find the largest number (8) \n"

        );

        System.out.println(options);
    }
}
