package com.forecasst;


public class Forecast {
    public double predictFutureValue(double currentValue, double growthRatePercent, int years) 
    {
    	 if (years == 0) {
             return currentValue;
         }
    	
        double growthRate = growthRatePercent / 100.0;
       
        return predictFutureValue(currentValue * (1 + growthRate), growthRatePercent, years - 1);
    }
}

