import java.util.Scanner;

public class Gamma1 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		boolean enter =true;
        while (enter) {
            try {
    	        System.out.println("Please enter a number:");
    	        double x = sc.nextDouble();
    	        if((!Double.isFinite(x))) {
    	        	System.out.println("Input error, the input is not a finite floating-point value.");
    	        }else {
    	        	enter=false;
    	        	System.out.println("Gamma(" + x + ") = " + gamma(x));
    	        	}
            } catch (Exception e) {	  
            	System.out.println("Input error, the input is not a number.");
            	sc = new Scanner(System.in);
            } 
        }
	}

	public static double logGamma(double x) {
		double sqrt_2PI = 2.5066282746310002;
		double leadingFactor = (x - 0.5) * ln(x + 4.5) - (x + 4.5);
		double series = 1.000000000190015 + 76.18009172947146 / (x + 0) - 86.50532032941677 / (x + 1)
						+ 24.01409824083091 / (x + 2) - 1.231739572450155 / (x + 3)
						+ 0.001208650973866179 / (x + 4) - 0.000005395239384953 / (x + 5);
		return leadingFactor + ln(series * sqrt_2PI);
	}

	public static double gamma(double x) { 

		if(x < 1) {
			return gamma(x+1)/x;
		}else {
			return exp(logGamma(x)); 
		}
	}
	public static double ln(double x){
		if(x > 1) {
			double ln2 = 0.6931471805599453;
			return ln2+ln(x / 2);
		}else{
			int sign=1;
			double numerator = 1.0;
			double Denominator =1.0;
			double sum= 0.0;
			double term = 1.0;
			for(int i = 1;sum != sum+term;i++) {
				numerator = numerator*(x-1);
				Denominator = i;
				if(i % 2==1) {
					sign = 1;
				}else {
					sign = -1;
				}
				term = (numerator*sign)/Denominator;
				sum = sum + term;
			}
			return sum;
		}
	}
	public static double exp(double x) {       
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = -x;
		}
		double term = 1.0;
		double sum = 0.0;
		for (int i = 1; sum != sum + term; i++) {
			sum += term;
			term *= x/i;
		}
		if (isNegative)
			sum = 1.0 / sum;
		return sum;
	}
}