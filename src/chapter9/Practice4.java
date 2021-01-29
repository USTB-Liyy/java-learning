package chapter9;

interface inter1{
	void A1();
}

interface inter2{
	void A2();
}

interface inter3 extends inter1, inter2{
	void A1();
	void A3();
}

interface inter4 extends inter2{
	void A4();
}

interface inter5 extends inter3, inter4{}

class Imple implements inter5{

	@Override
	public void A3() {
		// TODO Auto-generated method stub
		System.out.println("A3");
	}

	@Override
	public void A1() {
		// TODO Auto-generated method stub
		System.out.println("A1");		
	}

	@Override
	public void A2() {
		System.out.println("A2");		
	}

	@Override
	public void A4() {
		System.out.println("A4");
	}
	
}
public class Practice4 {

	public static void main(String[] args) {
		Imple i = new Imple();
		i.A1();
		i.A2();
		i.A3();
		i.A4();
	}

}
