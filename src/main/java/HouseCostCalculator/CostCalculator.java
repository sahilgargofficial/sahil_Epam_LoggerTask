package HouseCostCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CostCalculator {
    private String materialstandard;
    private String automated;
    private double totalarea;
    private static final Logger LOGGER = LogManager.getLogger(CostCalculator.class);
    public CostCalculator(String materialstandard,double totalarea,String automated)
    {
        LOGGER.info("Inside Cost Calculator constructor");
        this.materialstandard = materialstandard;
        this.totalarea = totalarea;
        this.automated = automated;
    }
    public double costCalculate()
    {
        LOGGER.info("Inside costCalculate method");
        double costperSquareFeet = 0;
        if(materialstandard.equalsIgnoreCase("standard"))
            costperSquareFeet = 1200;
        else if(materialstandard.equalsIgnoreCase("above standard"))
            costperSquareFeet = 1500;
        else if(materialstandard.equalsIgnoreCase("high standard"))
        {
            costperSquareFeet = 1800;
            if(automated.equals("yes"))
                costperSquareFeet = 2500;
        }
        double totalcost = costperSquareFeet*totalarea;
        return totalcost;
    }
}