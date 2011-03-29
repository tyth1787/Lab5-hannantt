import java.util.ArrayList;


public class PrimeFactorization {
	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 2; n > 1; i++) {
			for (;n % i == 0; n/=i) {
				tempArray.add(i);
			}
		}
		return tempArray;
	}

	public static ArrayList<Integer> primeNumberGenerator(int i) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int z = 1; z < i; z++){
			if(generatePrimes(z).equals(list(z))){
				temp.add(z);
			}
		}
		return temp;
	}
	
	private static ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
