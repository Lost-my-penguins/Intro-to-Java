/* (Average speed in kilometers) Assume that a runner runs
 *  24 miles in 1 hours, 40 minutes, and 35 seconds.vWrite 
 *  a program that displays the average speed in kilometers 
 *  per hour.
 *  (Note 1 mile is equal to 1.6 kilometers)
 */

public class Exercise_01_12 {
	public static void main(String[] args) {
		System.out.println("Average speed of runner is: " + ((24 * 1.6)/(1 + (40.0/60) + (35.0/3600))));
	}
}
