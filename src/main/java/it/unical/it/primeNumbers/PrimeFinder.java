package it.unical.it.primeNumbers;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class PrimeFinder 
{
	public boolean isPrime(Integer n)
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	public ArrayList<Integer> getPrimes(Integer n)
	{
		if(n == 1 || n == 0) return null;
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(n >= 2)
			primes.add(2);
		
		for(int i = 3; i <= n; i+=2)
		{
			if(isPrime(i))
				primes.add(i);
		}
		
		return primes;
	}
	
    public static void main( String[] args )
    {
        PrimeFinder finder = new PrimeFinder();
        
        Integer n = 30;
        ArrayList<Integer> primes = finder.getPrimes(n);
        
        if(primes == null)
        {
        	System.out.println("Non ci sono primi");
        }
        else
        {
        	for(Integer i : primes)
            {
            	System.out.println(i);
            }
        }
    }
}
