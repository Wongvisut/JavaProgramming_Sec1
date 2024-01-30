
public class Rectangle2 implements Shape2{
	
	private double width,length;
	
	Rectangle2(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public String toString() {
		return "Ractangle[width= " + this.width
				+ ",length= " + this.length;
	}
}
