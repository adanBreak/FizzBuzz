package com.pactera.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	/**
	 * Get results from resource folders, and FizzBuzz to do simple comparison
	 */
	public void testPositive() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("correctResult");		
		assertTrue(compare(result1, result2));
	}
	
	@Test
	public void testWronglyCount() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("wrongResult-7thLine");		
		assertFalse(compare(result1, result2));
	}
	
	@Test
	public void testWronglyFizz() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("wrongResult-7thLine");		
		assertFalse(compare(result1, result2));
	}
	
	@Test
	public void testWronglyBuzz() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("wrongResult-6thLine");		
		assertFalse(compare(result1, result2));
	}
	
	@Test
	public void testWronglyFizzBuzz() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("wrongResult-30thLine");		
		assertFalse(compare(result1, result2));
	}
	
	@Test
	public void testWronglyLackRounds() {
		List<String>result1 = FizzBuzz.say(33, 100, 3);
		List<String>result2 = getFromSampleFile("wrongResult-lackRounds");		
		assertFalse(compare(result1, result2));
	}
	
	
	
	
	public List<String> getFromSampleFile(String fileName)
	{
		ClassLoader classLoader = getClass().getClassLoader();
		List<String>result = new ArrayList<String>();
		
		File file = new File(classLoader.getResource(fileName).getFile());
		try
		{
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.add(line);
			}
			scanner.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public Boolean compare(List<String>result1, List<String>result2)
	{
		
		boolean result = true;
		
		try
		{
			
			for(int i = 0; i < result1.size(); i++)
			{
				if(!result1.get(i).equals(result2.get(i)))
				{
					result = false;
				}
			}
			
			for(int i = 0; i < result1.size(); i++)
			{
				if(!result1.get(i).equals(result2.get(i)))
				{
					result = false;
				}
			}
		}
		
		catch(Exception e)
		{
			return false;
		}
		
		
		return result;
	}

}
