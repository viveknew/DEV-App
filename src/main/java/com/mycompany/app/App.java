package com.example.bank;

public class App {
	
	public static void main(String args[]) {

double result = SimpleInterest.calculateSimpleInterest(10000, 5, 7);
System.out.println("The intrest per month is " + result);  
	}                                                                                                                       public static double calculateSimpleInterest(double amount,
        double years,
        double rate_of_interest) {
    double simple_interest;
    simple_interest = amount * years * rate_of_interest;
    return simple_interest;
} 
}
