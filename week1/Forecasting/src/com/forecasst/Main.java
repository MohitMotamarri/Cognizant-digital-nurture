package com.forecasst;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        Forecast forecast = new Forecast();

        float currentValue = sc.nextFloat();
        float growthRate = sc.nextFloat();
        int years = sc.nextInt();

        double futureValue = forecast.predictFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value: " + (int)futureValue);
    }
}
