
public class Main {

	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("First Object:");
		System.out.println("Perimeter = " + polygon1.perimeter());
		System.out.println("Area = " + polygon1.area());
		System.out.println("Position = (" + polygon1.getPosX() + " ; " + polygon1.getPosY() + ")");
		System.out.println();
		
		System.out.println("Second Object:");
		System.out.println("Perimeter = " + polygon2.perimeter());
		System.out.println("Area = " + polygon2.area());
		System.out.println("Position = (" + polygon2.getPosX() + " ; " + polygon2.getPosY() + ")");
		System.out.println();
		
		System.out.println("Third Object:");
		System.out.println("Perimeter = " + polygon3.perimeter());
		System.out.println("Area = " + polygon3.area());
		System.out.println("Position = (" + polygon3.getPosX() + " ; " + polygon3.getPosY() + ")");
		
		System.exit(0);
	}

}
