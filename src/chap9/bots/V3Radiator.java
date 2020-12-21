package chap9.bots;

import java.util.ArrayList;

class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList lglist) {
		//super(lglist);
		super();
		for(int g=0; g<10; g++) {
			lglist.add(new SimUnit("V3Radiator"));
		}
	}
}