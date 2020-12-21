package Chap4.CalcArea;

class CalcArea {
	
	int calcArea(int height, int width) {
		return (height * width);
	}
	
	int a = calcArea(7, 12);
	short c = 7;
//	calcArea(c, 15);		Hadn't declared a variable to receive it 
//	ind d = calcArea(57);	calcArea has 2 parameters, and here was passed only one
//	calcArea(2,3);			Same as line 11
	long t = 42;
//	int f = calcArea(t, 17);	Was expected t to be int, not long
//	int g = calcArea();			No parameters passed
//	calcArea();				No parameters passed and hadn't declared variable
//	byte h = calcArea(4, 20);	Was expected h to be int, not byte
//	int j = calcArea(2,3,5)		Was expected 2 parameters, not 3
}