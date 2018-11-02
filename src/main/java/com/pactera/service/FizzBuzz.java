package com.pactera.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gordon
 *
 */
public class FizzBuzz 
{
	public static List<String> say(int countOfPuples, int numbers, int rounds)
	{
		List<String> results = new ArrayList<String>();
		int cur = 0;
		int current_round = 1;
		
		loop:
		while(current_round <= rounds)
		{
			
			StringBuffer wordSb = new StringBuffer();
			cur ++;
			if(cur > numbers)
			{
				current_round ++;
				
				if(current_round > rounds)
				{
					break loop;
				}
				cur = 1;
			}
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
