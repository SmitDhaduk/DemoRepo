package polymorphism;

public class OverRiddingEx{
	
	int id;
	String name;
	String collegeName = "Seneca";
	
	void dispaly() {
		collegeName = "Seneca";
	}
	
	public static void main(String[] args) {
	
		OverRiddingEx ob = new OverRiddingEx();
		ob.dispaly();
	}
}
