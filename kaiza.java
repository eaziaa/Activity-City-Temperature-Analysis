class Main {

    public static void main(String[] args) {
        // Define the days of the week
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        // Define the cities
        String[] cities = {"City 1", "City 2", "City 3", "City 4", "City 5"};
        
        // Initialize temperature data for 7 days and 5 cities
        int[][] temperatures = {
            {30, 32, 28, 33, 29},  // Day 1 temperatures
            {27, 30, 26, 32, 28},  // Day 2 temperatures
            {31, 33, 25, 34, 30},  // Day 3 temperatures
            {28, 29, 27, 31, 32},  // Day 4 temperatures
            {26, 30, 24, 33, 31},  // Day 5 temperatures
            {32, 28, 22, 30, 29},  // Day 6 temperatures
            {29, 31, 23, 32, 30}   // Day 7 temperatures
        };
        
        displayTemperatures(daysOfWeek, cities, temperatures);
        
        averageTemperaturePerCity(cities, temperatures);
        
        hottestDay(daysOfWeek, cities, temperatures);
        
        coldestDay(daysOfWeek, cities, temperatures);
    }

    // Method to display temperatures for each day and city
    public static void displayTemperatures(String[] days, String[] cities, int[][] temperatures) {
        System.out.println("Temperatures for the Week:");
        for (int i = 0; i < 7; i++) {
            System.out.print(days[i] + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(temperatures[i][j] + "°C ");
            }
            System.out.println();
        }
    }

    // Method to calculate and display the average temperature per city
    public static void averageTemperaturePerCity(String[] cities, int[][] temperatures) {
        System.out.println("\nAverage Temperature Per City:");
        for (int j = 0; j < 5; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += temperatures[i][j];
            }
            double average = total / 7.0;
            System.out.println(cities[j] + ": " + average + "°C");
        }
    }

    public static void hottestDay(String[] days, String[] cities, int[][] temperatures) {
        int highestTemp = Integer.MIN_VALUE;
        String hottestDay = "";
        String hottestCity = "";
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (temperatures[i][j] > highestTemp) {
                    highestTemp = temperatures[i][j];
                    hottestDay = days[i];
                    hottestCity = cities[j];
                }
            }
        }
        
        System.out.println("\nHottest Day:");
        System.out.println("Day: " + hottestDay + ", City: " + hottestCity + ", Temperature: " + highestTemp + "°C");
    }

    public static void coldestDay(String[] days, String[] cities, int[][] temperatures) {
        int lowestTemp = Integer.MAX_VALUE;
        String coldestDay = "";
        String coldestCity = "";
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (temperatures[i][j] < lowestTemp) {
                    lowestTemp = temperatures[i][j];
                    coldestDay = days[i];
                    coldestCity = cities[j];
                }
            }
        }
        
        System.out.println("\nColdest Day:");
        System.out.println("Day: " + coldestDay + ", City: " + coldestCity + ", Temperature: " + lowestTemp + "°C");
    }
}
