// importing Arrays class
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Shape[] shapes1 = new Shape[5];
		shapes1[0] = new Rectangle(1, 2);
		shapes1[1] = new Rectangle(3, 4);
		shapes1[2] = new Rectangle(5, 6);
		shapes1[3] = new Hexagon(7);
		shapes1[4] = new Hexagon(8);
		
		// cloning array
		Shape[] shapes2 = shapes1.clone();
		Arrays.sort(shapes2);
		
		// displaying areas of all shapes in both arrays
		System.out.println("Areas in shapes1 " + Arrays.toString(shapes1));
		System.out.printf("Areas in shapes2 " + Arrays.toString(shapes2));
	}

		// total area of objects in shapes1 
		public static double sumArea(Shape[] z) {
			double total = 0;
			for (int i = 0; i < z.length; i++) {
				total += z[i].getArea();
			}
			return total;
	}
}
