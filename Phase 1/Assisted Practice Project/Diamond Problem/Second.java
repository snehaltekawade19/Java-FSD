package diamond;

public interface Second {

	public default void show() {
		System.out.println("This is my Second interface method");
	}
}