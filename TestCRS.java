public class Test{
	public static void main(String[] args) {
		Circle circle = new Circle(2);
		System.out.println("The name for this shpe is£º "+ circle.getName());
		System.out.println("The Area for this shape is : "+ circle.getArea());
		Rectangle rectangle= new Rectangle(2,2);
		System.out.println("The name for this shape is: "+ rectangle.getName());
		System.out.println("The Area for this shape is: "+ rectangle.getArea());
	}
}