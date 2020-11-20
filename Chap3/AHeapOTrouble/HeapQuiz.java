package Chap3.AHeapOTrouble;


class HeapQuiz {
	int id = 0;
	
	public static void main(String [] args) {
		
		int x = 0;
		HeapQuiz[] hq = new HeapQuiz[S];	// can't compile because S is not declared
		
		while (x < 3) {
			hq[x] = new HeapQuiz();
			hq[x].id = x;
			x = x + 1;
		}
		hq[3] = hq[1];	// hq[3] = id 1
		hq[4] = hq[1];	// hq[4] = id 1
		hq[3] = null;	
		hq[4] = hq[0];	// hq[4] = id 0;
		hq[0] = hq[3];	// hq[0] = null
		hq[3] = hq[2];	// hq[3] = id 2
		hq[2] = hq[0];	// hq[2] = null
		// do stuff
		/* In the end
		 * hq[0] = null;
		 * hq[1] = id 1;
		 * hq[2] = null;
		 * hq[3] = id 2;
		 * hq[4] = id 0;
		 */
	}
}