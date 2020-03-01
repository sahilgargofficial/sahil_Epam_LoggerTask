package HouseCostCalculator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;

public class HouseConstructionCost {
    private static final Logger LOGGER = LogManager.getLogger(HouseConstructionCost.class);
    static
    {
        LOGGER.info("Getting input data from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quality of material standard,above standard or high standard to be used.");
        String materialstandard = sc.nextLine();
        System.out.println("Enter total area of the house");
        double totalarea = sc.nextDouble();
        String automatedhouse = "no";
        if(materialstandard=="high standard") {
            System.out.println("Type yes if you want fully automated house with high standard material else type no");
            automatedhouse = "yes";
        }
        LOGGER.info("Creating cost calculate constructor");
        CostCalculator costCalculate = new CostCalculator(materialstandard, totalarea, automatedhouse);
        LOGGER.info("Calling cost Calculate method");
        double totalcost = costCalculate.costCalculate();
        System.out.println("The total cost of the house is "+totalcost);
    }
    public static void main(String[] args) {


    }
}
