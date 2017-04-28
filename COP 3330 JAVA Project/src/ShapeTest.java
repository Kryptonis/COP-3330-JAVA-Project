/**
 * Steven Tawney
 * COP 3330
 * John Wiggins
 * 
 * Problem: 10.13 (Project: Shape Hierarchy) pp. 439
 * 
 * Test program for abstract and concrete classes
 */

// Import
import java.util.Scanner;


// Begin Class for Shape Test
public class ShapeTest 
{

	public static void main(String args[]) 
	{	
		// Variables
		int loopCount = 0;
		
		// Initialize Scanner 
		Scanner input = new Scanner (System.in);

		// Scanner to run for loop for number of shapes to be evaluated
		System.out.println("Please enter the number of shapes to be evaluated.");
		loopCount = input.nextInt();
		
		// Begin loop
		for (int i = 0; i < loopCount; i++)
		{
			int shape = 0;
			int oriX = 0;
			int oriY = 0;
			int shapeDim1 = 0;
			int shapeDim2 = 0;
			int shapeDim3 = 0;
			String dimType1 = null;
			String dimType2 = null;
			String dimType3 = null;
		
			// User prompt for shape identity.
			System.out.println("\n\nChoose one fo the following shapes:\n1) Circle\n2) Square\n3) Triangle\n4) Sphere\n5) Cube\n6) Tetrahedron\n");
			shape = input.nextInt();		
			
			// While loop to ensure proper shape selection.
			while (shape <= 0 || shape > 7)
			{
				// User prompt for shape identity.
				System.out.println("\n\nChoose one fo the following shapes:\n1) Circle\n2) Square\n3) Triangle\n4) Sphere\n5) Cube\n6) Tetrahedron\n");
				shape = input.nextInt();
			}
			
			// Switch statement for dimensioning types for particular shapes.
			switch (shape) 
			{
				case 1:  dimType1 = "Radius";
						break;
				case 2:  dimType1 = "Width";
						dimType2 = "Length";	
						break;
				case 3:  dimType1 = "Base";
						dimType2 = "Height";
						break;
				case 4:  dimType1 = "Radius";
						break;
				case 5:  dimType1 = "Width";
						dimType2 = "Length";
						dimType3 = "Height";
						break;
				case 6:  dimType1 = "Side length";
						break;
			}			
				
			// User prompt for x-component for center or origin.
			System.out.println("\nPlease enter the x-component of the center (Circles and Spheres only)\nor the origin (All other shapes.)");
			oriX = input.nextInt();		

			// User prompt for y-component for center or origin.
			System.out.println("\nPlease enter the y-component of the center (Circles and Spheres only)\nor the origin (All other shapes.)");
			oriY = input.nextInt();	
		
			// If else if statement for user input of dimensions given a particular shape.
			if (shape == 5 || shape == 6)
			{	
				if (shape == 5)
				{
					// User prompt for first dimension based on shape.
					System.out.printf("%n%s: ", dimType1);
					shapeDim1 = input.nextInt();	
			
					// User prompt for second dimension based on shape.
					System.out.printf("%n%s: ", dimType2);
					shapeDim2 = input.nextInt();
				
					// User prompt for third dimension based on shape.
					System.out.printf("%n%s: ", dimType3);
					shapeDim3 = input.nextInt();	
					
					Cube cube = new Cube(oriX, oriY, shapeDim1, shapeDim2, shapeDim3);
					System.out.printf("%n%s: ", cube.getShapeName());
					cube.print();
					System.out.printf("%n%s: %d%n%s: %d", "Area", cube.area(), "Volume", cube.volume());
				}
				
				else if (shape == 6)
				{	
					// User prompt for side dimension.
					System.out.printf("%n%s: ", dimType1);
					shapeDim1 = input.nextInt();	
					
					Tetrahedron tetrahedron = new Tetrahedron(oriX, oriY, shapeDim1);
					System.out.printf("%n%s: ", tetrahedron.getShapeName());
					tetrahedron.print();
					System.out.printf("%n%s: %d%n%s: %d", "Area", tetrahedron.area(), "Volume", tetrahedron.volume());
				}
			}
			
			else if (shape == 2 || shape == 3)
			{
				// User prompt for first dimension based on shape.
				System.out.printf("%n%s: ", dimType1);
				shapeDim1 = input.nextInt();	
		
				// User prompt for second dimension based on shape.
				System.out.printf("%n%s: ", dimType2);
				shapeDim2 = input.nextInt();
								
				if (shape == 2)
				{
					Square square = new Square(oriX, oriY, shapeDim1, shapeDim2);
					System.out.printf("%n%s: ", square.getShapeName());
					square.print();
					System.out.printf("%n%s: %d", "Area", square.area());
				}
				
				else if (shape == 3)
				{				
					Triangle triangle = new Triangle(oriX, oriY, shapeDim1, shapeDim2);
					System.out.printf("%n%s: ", triangle.getShapeName());
					triangle.print();
					System.out.printf("%n%s: %d", "Area", triangle.area());
				}
			}
		
			else if (shape == 1 || shape == 4)
			{
				// User prompt for first dimension based on shape.
				System.out.printf("%n%s: ", dimType1);
				shapeDim1 = input.nextInt();
				
				if (shape == 1)
				{
					Circle circle = new Circle(oriX, oriY, shapeDim1);
					System.out.printf("%n%s: ", circle.getShapeName());
					circle.print();
					System.out.printf("%n%s: %d", "Area", circle.area());
				}
				
				else if (shape == 4)
				{				
					Sphere sphere = new Sphere(oriX, oriY, shapeDim1);
					System.out.printf("%n%s: ", sphere.getShapeName());
					sphere.print();
					System.out.printf("%n%s: %d%n%s: %d", "Area", sphere.area(), "Volume", sphere.volume());
				}
			}
			
			else
			{
				System.out.println("Program has encountered an error and must exit.\nPlease restart.");
				System.exit(0);
			}
		}
		// End For Loop
	
		// Close Scanner 
		input.close();
		
		// Exit
		System.exit(0);
	}
	//End Main Method
	
}
// End Class for Shape Test