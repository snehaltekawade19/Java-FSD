package second;

import first.AccessMod;

public class AccessViaInheritance extends AccessMod {

	public static void main(String[] args) {
		AccessViaInheritance am = new AccessViaInheritance();
		
		//Accessing protected method in different package by inheritance
		am.welcome();

	}

}
