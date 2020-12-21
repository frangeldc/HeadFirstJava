package Chap2.TapeDeck;

class TapeDeckTestDrive {
	public static void main(String [] args) {
		TapeDeck t = new TapeDeck();	// declaration of t was missing
		t.canRecord = true;
		t.playTape();

		if (t.canRecord == true) {
			t.recordTape(); 
		}
	}
}
