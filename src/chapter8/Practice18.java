package chapter8;

class Shape {
	public void A() {
		System.out.println("A");
	}

	public void B() {
		System.out.println("B");
	}
}

class Circle extends Shape {
	public void C() {
		System.out.println("C");
	}
}

class Test1 {
	public static void main(String[] args) {
		Shape[] shs = { new Shape(), new Circle() };
		shs[1] = (Shape) shs[1];
		for (Shape s : shs) {
			System.out.println(s.getClass());
		}
		shs[1] = (Circle) shs[1];
		for (Shape s : shs) {
			System.out.println(s.getClass());
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		//right one
		Shape s1 = new Circle();
		((Circle) s1).C();
		
		//false 
		//1) 
		//Circle c = (Circle) new Shape();
		//c.C();
		//2)
		//Shape s2 = new Shape();
		//((Circle) s2).C();
		
		//Conclusion:
		/*
		 * ��Ҫ����ת�ͣ�����תΪ�����ࣩ��
		 * ��Ҫ�ڴ���ʱ�����������ֵ���������ã��ٽ�������ת��
		 * Shape s = new Circle();
		 * ((Circle) s1).C();
		 */
	}
}