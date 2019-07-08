package com.gordon.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gordon
 *
 */
public class FizzBuzz 
{
	
	private static FizzBuzz instance;
	private int number;
	
	private FizzBuzz(int number)
	{
		this.number = number;
	}
	
	
	/**
	 * Construct singleton instance to make sure it's only referenced once.
	 * @param number how many number you wish to run
	 * @return saying list
	 */
	public static FizzBuzz getInstance(int number)
	{
		if(instance == null)
		{
			return new FizzBuzz(number);
		}
		
		else return instance;
	}
	
	public List<String> say()
	{
		List<String> results = new ArrayList<String>();
		
		
		
		for(int cur = 1; cur <= this.number; cur++)
		{
			StringBuffer wordSb = new StringBuffer();
			if(cur % 3 == 0)
			{
				wordSb.append("Fizz");
			}
			
			if(cur % 5 == 0)
			{
				wordSb.append("Buzz");
			}
			if(cur % 3 != 0 && cur % 5 != 0)
			{
				wordSb.append(cur + "");
			}
			if(!wordSb.toString().equals(""))
			{
				results.add(wordSb.toString());
			}	
		}
			
		
		
		return results;
	}
	
	
	public static void print(List<String>results)
	{
		for(String word : results)
		{
			System.out.println(word);
		}
	}
}
