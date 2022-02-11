package assignments;

public class MyConstructor {
	String name;
	int rollNo;
	
	//Parametrized Constructor
	public MyConstructor(String nav, int no)
	{
		this.name = nav;
		this.rollNo = no;
	}
	
	//Non-Parametrized Constructor
	public MyConstructor()
	{
		this.name = "Default";
		this.rollNo = 3;
	}

	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor("Test",1);
		System.out.println(obj.name+" "+obj.rollNo);
		MyConstructor obj2 = new MyConstructor();
		System.out.println(obj2.name+" "+obj2.rollNo);
	}

}
