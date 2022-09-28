package polymorphism;

public class OverLoadingEx2 {
	
	 void sum(int a,int b){System.out.println("int arg method invoked");}  
	 void sum(long a,long b){System.out.println("long arg method invoked");}  
	  
	  public static void main(String args[]){  
		  OverLoadingEx2 obj=new OverLoadingEx2();  
	  obj.sum(20l,20l);
	  }  
}
