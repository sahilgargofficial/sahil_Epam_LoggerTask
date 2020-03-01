package InterestCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest extends Interest{
    private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);

    protected SimpleInterest(double principal,float time,float rate)
    {
            super(principal,time,rate);

    }
    protected double interestCalculate()
    {
        LOGGER.info("Inside interestCalculate method of SimpleInterest Class");
        double si = principal * rate * time;
        si = si/100;
        return si;
    }
}
