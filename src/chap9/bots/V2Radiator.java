package chap9.bots;

import java.util.ArrayList;

class V2Radiator {
	
	V2Radiator() {	}
	
	V2Radiator(ArrayList list) {
		for(int x=0; x<5; x++) {
			list.add(new SimUnit("V2Radiator"));
	}
		
}
}
