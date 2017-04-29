/**
 * Steven Tawney
 * COP 3330
 * John Wiggins
 * 
 * Problem: 10.13 (Project: Shape Hierarchy) pp. 439
 * 
 * Create an abstract class Shape for 3d and 2d concrete classes
 * to determine area and volume when appropriate
 */

/************************************************************/
// Begin Abstract Class Shape
abstract class Shape 
{

	// Variables for center or origin of shape
	private int x = 0;
	private int y = 0;
	
	// Constructor
	public Shape(int x, int y)
	{		
		this.x = x;
		this.y = y;		
	}
	
	// Set for x-coordinate of origin or center
	public void setX(int x)
	{
		this.x = x;
	}
	
	// Get for x-coordinate of origin or center
	public int getX()
	{
		return x;
	}
	
	// Set for y-coordinate of origin or center
	public void setY(int y)
	{
		this.y = y;
	}
	
	// Get for y-coordinate of origin or center
	public int getY()
	{
		return y;
	}
	
	// Abstract methods for all shapes
	public abstract String getShapeName();
	public abstract void print();
	
}
// End Abstract Class Shape
/************************************************************/


/************************************************************/
/************************************************************/
// Begin Abstract Class Two Dimensional Shape
abstract class TwoDimensionalShape extends Shape
{

	// Variables for dimensions (dim) of two dimensional shapes
	private int dim1 = 0;
	private int dim2 = 0;
	
	// Constructor
	public TwoDimensionalShape(int x, int y, int dimension1, int dimension2)
	{
		super(x,y);
		dim1 = dimension1;
		dim2 = dimension2;
	}
	
	// Set for dimension1
	public void setDim1(int dimension1)
	{
		dim1 = dimension1;
	}
	
	// Get for dimension1
	public int getDim1()
	{
		return dim1;
	}
	
	// Set for dimension2
	public void setDim2(int dimension2)
	{
		dim2 = dimension2;
	}
		
	// Get for dimension2
	public int getDim2()
	{
		return dim2;
	}
	
	// Abstract method for area
	public abstract int area();
	
}
// End Abstract Class Two Dimensional Shape


/************************************************************/
//Begin Circle Class
class Circle extends TwoDimensionalShape
{
	
	// Constructor
	public Circle(int x, int y, int radius)
	{
		super(x, y, radius, radius);
	}
	
	// Set for radius
	public void setRadius(int radius)
	{
		super.setDim1(radius);
	}
	
	// Get for radius
	public int getRadius()
	{
		return super.getDim1();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Circle";
	}
	
	// Calculate area for circle
	public int area()
	{
		return(int) (Math.PI*getRadius()*getRadius());
	}
	
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d", "Center", super.getX(), super.getY(), "Radius", getRadius());
	}
		
}
//End Circle Class


/************************************************************/
//Begin Square Class
class Square extends TwoDimensionalShape
{
	
	// Constructor
	/** 
	 * Utilizes 2 side variables instead of one for use 
	 * of code for squares or rectangles.
	 */
	public Square(int x, int y, int side1, int side2)
	{
		super(x, y, side1, side2);
	}
	
	// Set for side1
	public void setSide1(int side1)
	{
		super.setDim1(side1);
	}
	
	// Get for side1
	public int getSide1()
	{
		return super.getDim1();
	}
	
	// Set for side2
	public void setSide2(int side2)
	{
		super.setDim2(side2);
	}
	
	// Get for side2
	public int getSide2()
	{
		return super.getDim2();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Square or Rectangle";
	}
	
	// Calculate area for square
	public int area()
	{
		return(int) (getSide1()*getSide2());
	}
	
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d    %n%s: %d", "Origin", super.getX(), super.getY(), "Side 1", getSide1(), "Side 2", getSide2());
	}
		
}
//End Square Class


/************************************************************/
//Begin Triangle Class
class Triangle extends TwoDimensionalShape
{
	
	// Constructor
	public Triangle(int x, int y, int base, int height)
	{
		super(x, y, base, height);
	}
	
	// Set for base of triangle
	public void setBase(int base)
	{
		super.setDim1(base);
	}
	
	// Get for base of triangle
	public int getBase()
	{
		return super.getDim1();
	}
	
	// Set for height of triangle
	public void setHeight(int height)
	{
		super.setDim2(height);
	}
	
	// Get for height of triangle
	public int getHeight()
	{
		return super.getDim2();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Triangle";
	}
	
	// Calculate area for triangle
	public int area()
	{
		return(int) (.5*getBase()*getHeight());
	}
	
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d    %n%s: %d", "Origin", super.getX(), super.getY(), "Base", getBase(), "Height", getHeight());
	}
		
}
//End Triangle Class
/************************************************************/
/************************************************************/


/************************************************************/
/************************************************************/
/************************************************************/
// Begin Abstract Class Three Dimensional Shape
abstract class ThreeDimensionalShape extends Shape
{

	// Variables for dimensions (dim) of two dimensional shapes
		private int dim1 = 0;
		private int dim2 = 0;
		private int dim3 = 0;
		
		// Constructor
		public ThreeDimensionalShape(int x, int y, int dimension1, int dimension2, int dimension3)
		{
			super(x,y);
			dim1 = dimension1;
			dim2 = dimension2;
			dim3 = dimension3;
		}
		
		// Set for dimension1
		public void setDim1(int dimension1)
		{
			dim1 = dimension1;
		}
		
		// Get for dimension1
		public int getDim1()
		{
			return dim1;
		}
		
		// Set for dimension2
		public void setDim2(int dimension2)
		{
			dim2 = dimension2;
		}
			
		// Get for dimension2
		public int getDim2()
		{
			return dim2;
		}
		
		// Set for dimension3
		public void setDim3(int dimension3)
		{
			dim3 = dimension3;
		}
				
		// Get for dimension3
		public int getDim3()
		{
			return dim3;
		}
		
		// Abstract method for area and volume
		public abstract int area();
		public abstract int volume();
	
}
// End Abstract Class Three Dimensional Shape

/************************************************************/
//Begin Sphere Class
class Sphere extends ThreeDimensionalShape
{
	
	// Constructor
	public Sphere(int x, int y, int radius)
	{
		super(x, y, radius, radius, radius);
	}
	
	// Set for radius
	public void setRadius(int radius)
	{
		super.setDim1(radius);
	}
	
	// Get for radius
	public int getRadius()
	{
		return super.getDim1();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Sphere";
	}
	
	// Calculate area for Sphere
	public int area()
	{
		return(int) (4*Math.PI*getRadius()*getRadius());
	}
	
	// Calculate volume for Sphere
	public int volume()
	{
		return(int) ((4/3)*Math.PI*getRadius()*getRadius()*getRadius());
	}
	
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d", "Center", super.getX(), super.getY(), "Radius", getRadius());
	}
		
}
//End Sphere Class


/************************************************************/
//Begin Cube or Rectangular Prism Class
class Cube extends ThreeDimensionalShape
{
	
	// Constructor
	/** 
	 * Utilizes 3 side variables instead of one for 
	 * use of code for cubes or rectangular prisms.
	 */
	public Cube(int x, int y, int side1, int side2, int side3)
	{
		super(x, y, side1, side2, side3);
	}
	
	// Set for side1
	public void setSide1(int side1)
	{
		super.setDim1(side1);
	}
	
	// Get for side1
	public int getSide1()
	{
		return super.getDim1();
	}
	
	// Set for side2
	public void setSide2(int side2)
	{
		super.setDim2(side2);
	}
	
	// Get for side2
	public int getSide2()
	{
		return super.getDim2();
	}
	
	// Set for side3
	public void setSide3(int side3)
	{
		super.setDim3(side3);
	}
	
	// Get for side3
	public int getSide3()
	{
		return super.getDim3();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Cube or Rectangular Prism";
	}
	
	// Calculate area for cube
	public int area()
	{
		return(int) (getSide1()*getSide2());
	}
	
	// Calculate volume for cube
	public int volume()
	{
		return(int) (getSide1()*getSide2()*getSide3());
	}
	
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d    %n%s: %d    %n%s: %d", "Origin", super.getX(), super.getY(), "Width", getSide1(), "Length", getSide2(), "Height", getSide3());
	}
		
}
//End Cube or Rectangular Prism Class


/************************************************************/
//Begin Tetrahedron Class
class Tetrahedron extends ThreeDimensionalShape
{
	
	// Constructor
	public Tetrahedron(int x, int y, int sideA)
	{
		super(x, y, sideA, sideA, sideA);
	}
	
	// Set for base of Tetrahedron
	public void setSideA(int sideA)
	{
		super.setDim1(sideA);
	}
	
	// Get for base of Tetrahedron
	public int getSideA()
	{
		return super.getDim1();
	}
	
	// toString override
	@Override
	public String getShapeName()
	{
		return "Tetrahedron";
	}
	
	// Calculate area for Tetrahedron
	public int area()
	{
		return(int) (Math.sqrt(3)*(getSideA()*getSideA()));
	}
	
	// Calculate volume for Tetrahedron
	public int volume()
	{
		return(int) ((getSideA()*getSideA()*getSideA())/(6*Math.sqrt(2)));
	}
		
	public void print()
	{
		System.out.printf("%n%s: (%d,%d)    %n%s: %d", "Origin", super.getX(), super.getY(), "Sides", getSideA());
	}
		
}
//End Tetrahedron Class

/************************************************************/
/************************************************************/
/************************************************************/

