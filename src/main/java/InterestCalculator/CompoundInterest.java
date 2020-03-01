package InterestCalculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest extends Interest{
    private static final Logger LOGGER = LogManager.getLogger(CompoundInterest.class);
    protected   CompoundInterest(double principal,float time,float rate)
    {
        super(principal,time,rate);
    }
    protected double interestCalculate()
    {
        LOGGER.info("Inside interestCalculate method of CompoundInterest class");
        double ci = principal*(Math.pow(1+rate/100,time));
        return ci;
    }

}
