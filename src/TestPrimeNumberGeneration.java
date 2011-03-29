import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * TODO Put here a description of what this class does.
 *
 * @author localmgr.
 *         Created Mar 28, 2011.
 */
public class TestPrimeNumberGeneration {
	
	@Test
	public void testOne() {
		assertEquals(list(),PrimeFactorization.primeNumberGenerator(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(),PrimeFactorization.primeNumberGenerator(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(2),PrimeFactorization.primeNumberGenerator(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2,3),PrimeFactorization.primeNumberGenerator(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2,3,5),PrimeFactorization.primeNumberGenerator(6));
	}
	
	@Test
	public void testThirteen() {
		assertEquals(list(2,3,5,7,11),PrimeFactorization.primeNumberGenerator(13));
	}
	
	@Test
	public void testBigNumber() {
		assertEquals(list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101),PrimeFactorization.primeNumberGenerator(103));
	}
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
