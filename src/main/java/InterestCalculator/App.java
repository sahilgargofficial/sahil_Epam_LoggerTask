package InterestCalculator;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    static
    {

        LOGGER.info("Making new objects of Simple Interest Class");
        SimpleInterest simpleInterest = new SimpleInterest(10000, 4, 8.5f);
        LOGGER.info("Calling interestCalculate method for calculating simple Interest");
        double simpleinterest = simpleInterest.interestCalculate();
        LOGGER.info("Making new object of Compound Interest Class");
        CompoundInterest compoundInterest = new CompoundInterest(15000, 5, 7);
        LOGGER.info("Calling interestCalculate method for calculating Compound Interest");
        double Compoundinterest = compoundInterest.interestCalculate();
    }
    public static void main(String[] args) {


    }
}
