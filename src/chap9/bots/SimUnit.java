package chap9.bots;
import java.util.*;


class SimUnit {
	String botType;
	SimUnit(String type) {
		botType = type;
		System.out.println("New SimUnit Created " + botType);
	}

	int powerUse() {
	if ("Retention".equals(botType)) {
		return 2;
	} else {
		return 4;
		}
	}
}
