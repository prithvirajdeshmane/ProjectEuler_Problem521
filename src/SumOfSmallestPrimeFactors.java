import java.util.ArrayList;

public class SumOfSmallestPrimeFactors {
	
	private static ArrayList<Double> listOfPrimes = new ArrayList<Double>();

	public static void main(String[] args) {
		
		//double number = Math.pow(10, 2);
		double number = Math.pow(10, 12);
		
		double sum = findSum(number);
		
		System.out.println("S(" + number + ") = " + sum);

	}
	
	private static double findSum(double num) 
	{
		double sum = 0;
		
		for (double i = 2; i <= num; i++ ) {
			double smpf = findSmpf(i);
			sum += smpf % Math.pow(10, 9);
		}
		
		return sum;
	}
	
	private static double findSmpf(double n)
	{
		
		if(MathFunctions.isPrime(n)) {
			listOfPrimes.add(n);
			System.out.println(n + " | " + n);
			return n;
		}
		
		for (Double prime : listOfPrimes) {
			if(n % prime == 0) {
				System.out.println(n + " | " + prime);
				return prime;
			}
		}
		
		return 0;
	}

}
