package review;

public class MethodOverloading {
	
	public void area(int length, int breadth) {
		System.out.println("Area of rectangle: " +(length*breadth));
	}
	
	public void area(float radius) {
		System.out.println("Area of circle: " +(3.14*radius*radius));
	}
	
	public void area(int side) {
		System.out.println("Area of square: " +(side*side));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.area(2.5f);
		obj.area(10);
		obj.area(10, 5);
	}

}
