package trycatchdemo;

public class PasswordNotValidException extends Exception{
	private String msg;
	
	public PasswordNotValidException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PasswordNotValidException [msg=" + msg + "]";
	}
}
