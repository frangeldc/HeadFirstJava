/*
 * Output needs to be:
   a noise
   annoys
   an oyster
 */

/*
 * System.out.print(" ");
 * System.out.print("a");
 * System.out.print("n");
 * System.out.print("an");
 * 
 * System.out.print("noys");
 * System.out.print("oise");
 * System.out.print(" oyster");
 * System.out.print("annoys ");
 * System.out.print("noise");
 * 
 */
package Chap1;

public class PoolPuzzleOne {
	public static void main(String[] args) {
		int x = 0;
		
		while (x < 4) {
			System.out.print("a");
			if (x < 1) {						// can't change
				System.out.print(" ");
			}
			System.out.print("n");
			
			if (x > 1) {						
				System.out.print(" oyster");
				x = x + 2;
			}
			
			if (x == 1) {						// can't change
				System.out.print("noys");
			}
			
			if (x < 1) {
				System.out.print("oise");
			}
			System.out.println("");				// can't change
			x = x + 1; 							
		}
	}
}
