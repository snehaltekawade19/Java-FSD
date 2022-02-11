package practice;

public class OuterInner {

	public int a=3;
	private String b="Welcome to the code";
	
	class Inner
	{
		public void display()
		{
			System.out.println("Value of a "+a);
			System.out.println("Value of b "+b);
		}
	}
	
	public static void main(String[] args) {
		OuterInner outer=new OuterInner();
		OuterInner.Inner inner=outer.new Inner();
		
		inner.display();
	}
}
