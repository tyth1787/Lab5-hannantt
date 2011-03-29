import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class TestPrimeFactorization {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactorization.generatePrimes(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2),PrimeFactorization.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3),PrimeFactorization.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2,2),PrimeFactorization.generatePrimes(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2,3),PrimeFactorization.generatePrimes(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2,2,2),PrimeFactorization.generatePrimes(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3,3),PrimeFactorization.generatePrimes(9));
	}
	
	@Test
	public void test325115() {
		assertEquals(list(5,7,7,1327),PrimeFactorization.generatePrimes(325115));
	}
	
	
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
