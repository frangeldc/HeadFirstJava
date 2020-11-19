package Chap1;
// Mixed Messages
public class Test {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
		//	Here goes the candidates
		//	y = x - y;	// prints 00 11 21 32 42
		//	y = x + y;	// prints 00 11 23 36 410
		/* // prints 02 14 25 36 47
			y = y + 2;
			if (y > 4){
				y = y - 1;
			}
		*/
		/*	// prints 11 34 59
		 	x = x + 1;
			y = y + x;
		*/
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}
}
