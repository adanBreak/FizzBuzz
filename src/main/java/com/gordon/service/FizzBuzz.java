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
	public static List<String> say(int number)
	{
		List<String> results = new ArrayList<String>();
		
		
		
		for(int cur = 1; cur <=100; cur++)
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
