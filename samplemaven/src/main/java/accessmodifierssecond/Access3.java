package accessmodifierssecond;

import accessmodifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 obj1=new Access1();
		obj1.display1();
		
		Access3 obj2=new Access3();
		obj2.display1();
		obj2.display2();
		
	}

}
