package com.gordon.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Test;

import com.gordon.service.FizzBuzz;

public class FizzBuzzTest {
	
	static Logger logger = Logger.getLogger(FizzBuzzTest.class.getName());


	@Test
	/**
	 * Get results from resource folders, and FizzBuzz to do simple comparison
	 */
	public void test() {
		logger.info("Testing normal positive result.");
		List<String>result1 = FizzBuzz.getInstance(100).say();
		List<String>result2 = getFromSampleFile("CorrectResult");		
		assertTrue(compare(result1, result2));
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
