package com.gordon.app;

import java.util.List;

import com.gordon.service.FizzBuzz;

/**
 * 
 * @author gordon
 *
 */
public class Main 
{
	public static void main(String[]args)
	{
		int number = 100;
		List<String>results = FizzBuzz.say(number);
		FizzBuzz.print(results);
	}
}
