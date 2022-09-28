package polymorphism;

public class OverLoadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		Test t2 = new Test();
		t1.Display(1,"  Darshan");
		t2.Display(1);
	}

}
class Test{
	int id;
	String name;
	
	static void Display(int id, String name) {
		System.out.println(id+""+name);
	}
	static void Display(int id) {
		System.out.println(id);
	}
}