package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			if (n==0) {
				return 0;
			}
			else {
				return 1/Math.pow(2,n) + geometricSum(n-1);
			}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} 
		else {
			/*int temp = p%q;
			p=q;
			q = temp;*/
			return gcd(q,p%q);
		}
			// FIXME compute the gcd of p and q using recursion
			//return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helper (int[]array, int[]reversed, int i){
		if (i > array.length/2) {
			return reversed;
		}
		else {
			int mirrorIndex = array.length-i-1;
			reversed[mirrorIndex]=array[i];
			reversed[i]=array[mirrorIndex];
			return helper(array, reversed, i+1);
		}
	}
	
	
	public static int[] toReversed(int[] array) {
		int[]reversed = new int[array.length];
		if(array.length<1) {
			return reversed;
		}
		else {
			return helper(array, reversed, 0);
		}
			// FIXME create a helper method that can recursively reverse the given array
			
			
		
	}


	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
