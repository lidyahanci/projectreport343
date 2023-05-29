import java.util.Arrays;
import java.util.Random;

public class Main {
    
    // Define the maximum temperature and cooling rate for the annealing process
    private static final double MAX_TEMPERATURE = 10000;
    private static final double COOLING_RATE = 0.03;
    private static int[] values = {68, 64, 47, 55, 72, 53, 81, 60, 72, 80, 62, 42, 48, 47, 68, 51, 48, 68, 83, 55, 48, 44, 49, 68, 63, 71, 82, 55, 60, 63, 56, 75, 42, 76, 42, 60, 75, 68, 67, 42, 71, 58, 66, 72, 67, 78, 49, 50, 51};
    private static int[] weights = {21, 11, 11, 10, 14, 12, 12, 14, 17, 13, 11, 13, 17, 14, 16, 10, 18, 10, 16, 17, 19, 12, 12, 16, 16, 13, 17, 12, 16, 13, 21, 11, 11, 10, 14, 12, 12, 14, 17, 13, 11, 13, 17, 14, 16, 10, 18, 10, 16};

    private static int knapsackCapacity = 300;
    
    // Define the solution state variables
    private static boolean[] currentSolution;
    private static boolean[] bestSolution;
    private static int currentValue;
    private static int bestValue;

    public static void main(String[] args) {
        // Initialize the solution state variables
        currentSolution = new boolean[values.length];
        bestSolution = new boolean[values.length];
        currentValue = 0;
        bestValue = 0;
        
        // Initialize the random number generator
        Random random = new Random();
        
        
        // Knapsack solution
        double[] valueToWeightRatio = new double[values.length];
        for (int i = 0; i < valueToWeightRatio.length; i++) {
            valueToWeightRatio[i] = (double) values[i] / weights[i];
        }
        boolean[] itemSelected = new boolean[currentSolution.length];
        for (int i = 0; i < currentSolution.length; i++) {
            itemSelected[i] = currentSolution[i];
        }
        int maxValue = 0;
        int selectedIndex = 0;
        int remainingCapacity = knapsackCapacity;
        int itemCount = itemSelected.length;
        

        while (itemCount != 0) {
            double maxRatio = 0;
            for (int i = 0; i < valueToWeightRatio.length; i++) {
                if (maxRatio <= valueToWeightRatio[i] && !itemSelected[i]) {
                    maxRatio = valueToWeightRatio[i];
                    selectedIndex = i;
                }
            }
            if (remainingCapacity - weights[selectedIndex] >= 0) {
                itemSelected[selectedIndex] = true;
                maxValue += values[selectedIndex];
                remainingCapacity -= weights[selectedIndex];
            }

            itemCount--;
        }

        bestValue = maxValue;
        bestSolution = itemSelected;

        // Start the simulated annealing process
        double temperature = MAX_TEMPERATURE;
        while (temperature > 1) {
        	// Generate a neighbor solution
        	boolean[] newSolution = new boolean[currentSolution.length];
        	for (int i = 0; i < currentSolution.length; i++) {
        	    newSolution[i] = currentSolution[i];
        	}
        	
        	int solLength= newSolution.length;
        	int randomIndex = random.nextInt(solLength);
        	remainingCapacity = remainingWeightOfKnapsack(newSolution);
        	if (remainingCapacity > weights[randomIndex] && !newSolution[randomIndex]) {
        	    newSolution[randomIndex] = true;
        	    
        	} else {
        	    newSolution[randomIndex] = !newSolution[randomIndex];
        	   
        	}

        	int neighborValue = calculateValue(newSolution);
        	 double probOfAcceptance= calculateAcceptanceProbability(currentValue, neighborValue, temperature);
              
        	 double doubleRand=random.nextDouble();
        	 
        	 if (probOfAcceptance >doubleRand ){
                 currentSolution = newSolution;
                 currentValue = neighborValue;
             } 
        	 if (currentValue > bestValue) {
        		 
        		 for (int i = 0; i < currentSolution.length; i++) {
        			    bestSolution[i] = currentSolution[i];
        			}
                 bestValue = currentValue;
             }
             System.out.println(currentValue + " " + bestValue);
            
             
             //Decrease the temperature
             temperature *= 1 - COOLING_RATE;
         }

        
        // Print the best solution found
        System.out.println("Best Solution: " + Arrays.toString(bestSolution));
        System.out.println("Best Value: " + bestValue);
    }
    
    //See the remainings of our Knapsack
    private static int remainingWeightOfKnapsack(boolean[] solution) {
       
    	int totalWeight = 0;
        int len= solution.length;
        for (int i = 0; i < len; i++) {
            if (solution[i]) {
            	totalWeight += weights[i];
            }
        }
        return knapsackCapacity - totalWeight;
    
    }
    // Helper method to calculate the fitness value of a solution
    private static int calculateValue(boolean[] solution) {
        int value = 0;
        int weight = 0;
        for (int i = 0; i < solution.length; i++) {
            if (solution[i]) {
                value += values[i];
                weight += weights[i];
            }
        }
        if (weight > knapsackCapacity) {
            return 0;
        } else {
            return value;
        }
    }
   
    // Helper method to calculate the acceptance probability of a neighbor solution
    private static double calculateAcceptanceProbability(int currentValue, int neighborValue, double temperature) {
        if (neighborValue > currentValue) {
            return 1;
        } else {
            return Math.exp((neighborValue - currentValue) / temperature);
        }
    }
}