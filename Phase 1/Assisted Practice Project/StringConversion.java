package practice;

public class StringConversion {

	public static void main(String[] args) {
			
			String str= new String("Snehal Tekawade");
			//convert string to stringBuilder
			StringBuilder s1=new StringBuilder(str);
			
			System.out.println("size "+s1.length());
			
			s1.append(" Welcome");
			System.out.println(s1);
			
			s1.insert(17, " ");
			System.out.println(s1);
			
			s1.replace(12, 19, "Bye");
			System.out.println(s1);
			
			s1.reverse();
			System.out.println(s1);
			
			//convert string to stringBuffer
			String str2 = "Snehal Tekawade";
			StringBuffer s2=new StringBuffer(str2);
			
			System.out.println("size "+s2.length());
			
			s2.append(" Hello");
			System.out.println(s2);
			
			s2.insert(11, " ");
			System.out.println(s2);
			
			s2.replace(12, 19, "Hii");
			System.out.println(s2);
			
			s2.reverse();
			System.out.println(s2);
	}
}
