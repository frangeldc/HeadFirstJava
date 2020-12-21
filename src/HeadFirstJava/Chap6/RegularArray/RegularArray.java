package Chap6.RegularArray;

public class RegularArray {
	public static void main(String[] args) {
		String[] myList = new String[2];
		
		String a = new String("Whohoho");
		myList[0] = a;
		System.out.println(myList[0]);
		
		String b = new String("Frog");
		myList[1] = b;
		System.out.println(myList[1]);
		
		int theSize = myList.length;
		System.out.println(theSize);

//		Object o = myList[1];	// Wrong answer, it is String o = myList[1];!!
		
		myList[1] = null;
		
		boolean isIn = false;
		for (String name : myList) {
			if (name == b) {	// if (b.equals(name)) ... i tried if(name.equals(b)) and got error!
				isIn = true;
				break;
			}
		}
		System.out.println(isIn);
	}
}
