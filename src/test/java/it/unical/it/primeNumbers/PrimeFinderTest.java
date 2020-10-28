package it.unical.it.primeNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

public class PrimeFinderTest 
{
	private ArrayList<Integer> getRandomNumbers(int n)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i < n; i++)
		{
			numbers.add(r.nextInt());
		}
		
		return numbers;
	}
	
	@Test
	public void devonoEsserePrimi()
	{
		PrimeFinder finder = new PrimeFinder();
		int n = 30;
		
		assertEquals(null, finder.getPrimes(0));
		assertEquals(null, finder.getPrimes(0));
		
		assertTrue(finder.isPrime(7));
		assertTrue(finder.isPrime(97));
		assertTrue(finder.isPrime(2));
		assertFalse(finder.isPrime(1332569802));
	}
}
