package Chap4.ElectricGuitar;

class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;
	
	String getbrand() {
		return brand;
	}
	
	void setBrand(String aBrand) {
		brand = aBrand;
	}
	
	int getNumOfPickups() {
		return numOfPickups;
	}
	
	void setNumOfPickups(int num) {
		numOfPickups = num;
	}
	
	boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}
	
	void setGetRockStarUsesIt(boolean yesOrNo) {
		rockStarUsesIt = yesOrNo;
	}
}
