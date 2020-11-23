package Chap4.Clock;

class Clock {
	String time;
	
	void setTime(String t) {
		time = t;
	}
	
	String getTime() {	// getTime return something, so, it cannot be void
		return time;
	}
}
