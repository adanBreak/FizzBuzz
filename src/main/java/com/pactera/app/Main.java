package com.pactera.app;

import java.util.List;

import com.pactera.service.FizzBuzz;

/**
 * 
 * @author gordon
 *
 */
public class Main 
{
	public static void main(String[]args)
	{
		int countOfPuples = 33;
		int numbers = 100;
		int rounds = 3;
		List<String>results = FizzBuzz.say(countOfPuples, numbers, rounds);
		FizzBuzz.print(results);
	}
}
