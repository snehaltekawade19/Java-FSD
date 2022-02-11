package practice;

public class EncapsulationDemo {

	private int id;
	private String name;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmail("Bhavikrpatel35@gmail.com");
		ed.setId(3200);
		ed.setName("Bhavik Wadiya");
		ed.setPassword("Password@123");
		
		System.out.println(ed.getName()+" "+ed.getId()+" "+ed.getEmail()+" "+ed.getPassword());
	}
	
}
