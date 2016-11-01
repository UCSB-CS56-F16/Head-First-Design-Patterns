package edu.ucsb.cs56.pconrad.hfdp;

import  headfirst.designpatterns.decorator.starbuzz.*;

public class CS56_F16_H14_Q4 {

    public static void main(String [] args) {
	
	Beverage beverage2 = new DarkRoast();

	beverage2 = new Mocha(beverage2);
	beverage2 = new Mocha(beverage2);
	beverage2 = new Whip(beverage2);

	System.out.println("beverage2 instanceof DarkRoast " +
			   (beverage2 instanceof DarkRoast));

	System.out.println("beverage2 instanceof Mocha " +
			   (beverage2 instanceof Mocha));

	System.out.println("beverage2 instanceof Whip " +
			   (beverage2 instanceof Whip));



    }


}
