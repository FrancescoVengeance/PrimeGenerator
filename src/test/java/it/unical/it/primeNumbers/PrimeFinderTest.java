package it.unical.it.primeNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimeFinderTest
{
	private static PrimeFinder finder;
	
	//viene eseguito prima dell'inizio di tutti i test della classe
	@BeforeClass
	public static void init()
	{
		finder = new PrimeFinder();
	}
	
	@Test
	public void primeNumbersGeneratorWorks()
	{
		assertEquals(null, finder.getPrimes(0));
		assertEquals(null, finder.getPrimes(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19,23), finder.getPrimes(23));
		//assertEquals(new ArrayList<Integer>(), finder.getPrimes(10)); lista vuota
	}
	
	@Test
	public void devonoEsserePrimi()
	{	
		assertTrue(finder.isPrime(2));
		assertFalse(finder.isPrime(4));
		assertFalse(finder.isPrime(6));
		assertFalse(finder.isPrime(40));
		assertFalse(finder.isPrime(45));
		
		assertTrue(finder.isPrime(7));
		assertTrue(finder.isPrime(97));
		assertTrue(finder.isPrime(2));
		assertFalse(finder.isPrime(1332569802));
	}
}
