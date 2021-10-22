package com.company;

public class w06dot2 {

    /**
     * The celsiusToFahrenheit Method
     * Purpose: Convert Celsius to Fahrenheit
     * @param tempCelsius The temperatures in celsius
     * @return double The temperature in Celsius
     */
    public static double celsiusToFahrenheit(double tempCelsius){
        return (tempCelsius * 1.8) + 32;
    }

    /**
     * The fahrenheitToCelsius Method
     * Purpose: Convert Fahrenheit to Celsius
     * @param tempFahrenheit The temperatures in fahrenheit
     * @return double The temperature in Celsius
     */
    public static double fahrenheitToCelsius(double tempFahrenheit){
        return (tempFahrenheit -32) / 1.8;
    }
    public static void main(String[] args) {
        System.out.println("This program will print out a table of conversions from Celsius to Fahrenheit and vice versa.\n");
        System.out.println("""
                Celsius\t\t\tFahrenheit\t|\tFahrenheit\t\t\tCelsius       \s
                ----------------------------------------------------------""");
        double DBLCEL = 40.0;
        double DBLFER = 120.0;
        for (int i=0; i<10; i++){
//            I could use these to clean up the printf statement, but I wanted to see if I could do the math inline.
//            DBLCEL = DBLCEL - i;
//            DBLFER = DBLFER - (i * 10);

            System.out.printf("""
                    %.1f\t\t\t%.1f\t\t|\t%.1f\t\t\t\t%.2f
                    """,DBLCEL-i, celsiusToFahrenheit((DBLCEL - i)), DBLFER - (i * 10), fahrenheitToCelsius((DBLFER - (i*10))));
        }
    }
}
