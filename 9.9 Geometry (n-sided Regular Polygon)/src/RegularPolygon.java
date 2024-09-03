
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public int getNumberOfSide() {
		return n;
	}
	
	public double getLengthOfSide() {
		return side;
	}
	
	public double getPosX() {
		return x;
	}
	
	public double getPosY() {
		return y;
	}
	
	public void setNumberOfSide(int n) {
		this.n = n;
	}
	
	public void setLengthOfSide(double side) {
		this.side = side;
	}
	
	public void setPosX(double x) {
		this.x = x;
	}
	
	public void setPosY(double y) {
		this.y = y;
	}
	
	public double perimeter() {
		return (getNumberOfSide()*getLengthOfSide());
	}
	
	public double area() {
		return (getNumberOfSide()*getLengthOfSide()*getLengthOfSide())/(4*Math.tan(Math.PI/getNumberOfSide()));
	}
}
