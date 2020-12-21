package chap10.mathTestDrive;

public class MathTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = Math.random();
		int r2 = (int) (Math.random() * 5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();

		int x = Math.abs(-240);
		double d = Math.abs(240.45);
		System.out.println(x);
		System.out.println(d);
		System.out.println();

		int xx = Math.round(-24.8f);
		int y = Math.round(24.45f);
		System.out.println(xx);
		System.out.println(y);
		System.out.println();

		int a = Math.min(24, 240);
		double b = Math.min(90876.5, 90876.49);
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		int aa = Math.max(24, 240);
		double bb = Math.max(90876.5, 90876.49);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println();

		
	}

}
