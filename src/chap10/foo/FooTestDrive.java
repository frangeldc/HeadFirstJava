package chap10.foo;

public class FooTestDrive {
	public static void main(String[] args) {
		
		Foo f = new Foo();
		f.go();
		Foo2.go();
		Foo3 f3 = new Foo3();
		f3.go();
		Foo4 f4 = new Foo4();
		f4.go();
		Foo5 f5 = new Foo5();
		f5.go(14);
		Foo6.go(15);
	}
}
