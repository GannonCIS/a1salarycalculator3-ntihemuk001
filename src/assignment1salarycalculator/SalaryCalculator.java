/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

import java.util.Scanner;

/**
 *
 * @author jessentihemuka
 */
public class SalaryCalculator {
    
    
    int salary;
    
    int totalHrsPerYear = 2080;
    
    public int calcHourlyWage(int salary){
        
        
        int hourlyRate = salary/totalHrsPerYear;
         System.out.println("If your salary is $" + salary + ", your hourly "
                + "wage is $" + hourlyRate + "/hour");
        return salary;
        
    }
    
    public int calcSalary(int hourlyRate){
        int salary = hourlyRate * totalHrsPerYear;
        System.out.println("If your hourly rate is $" + hourlyRate + ", your "
                + "salary is $" + salary);
        return hourlyRate;
    
    }
    
    public double calcTaxes(int salary, double perc){
        double calcTaxes = salary * perc;
        System.out.println("If your salary is $" + salary + ", you will pay "
                + calcTaxes + " in taxes");
        return perc;
        
    }
    
    public double monthlyAfterTax(int salary, double perc){
        double calcMonthlyTaxes = (salary * perc) / 12;
        System.out.println("If your salary is $" + salary + " and your tax rate is "
                + perc + " then your monthly take home cash should be " 
                + calcMonthlyTaxes);
        
        return salary;
        
    }
    
    
}
