package Chap6.RegularArray;
import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	// private int numOfHits;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			}
			else {
				result = "hit";
			}
		}
		return result;
	}	// close method
}	// close class
