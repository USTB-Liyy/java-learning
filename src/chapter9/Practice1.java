package chapter9;

abstract class Basic{
	private String s;
	private int index = count++;
	public static int count = 0;
	Basic(String s){
		this.s = s;
		System.out.println("Basic(String)");
	}
	Basic(){
		System.out.println("Basic()");
	}
	public String toString(){
		return "Basic\ts = " + s + "\tindex = " + index;
	}
	abstract void change(String s);
}
class A extends Basic{
	private String s;
	private int index = count++;
	public static int count = 0;
	A(String s){
		super(s);
		this.s = s;
		System.out.println("A(String)");
	}
	A(){
		System.out.println("A()");
	}
	public String toString(){
		return "A\ts = " + s + "\tindex = " + index;
	}
	void change(String s){
		this.s = s;
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A("123");
		System.out.println(a1);
		System.out.println(a2);
	}
}

