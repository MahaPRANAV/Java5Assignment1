package AssignmentFive;

public class Triangle extends Figure {
	
	double height;
	double breadth;
	double length;
	double Areatri;
	double Peritri;
	
	public Triangle(double length ,double breadth, double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void findArea()
	 {
		Areatri = (height * breadth)/2 ;
		 System.out.println("Area of Triangle "+ Areatri);
	 }
	
	void findPerimeter()
	 {
		  Peritri = 2 * (length + breadth + height ) ;
		  System.out.println("Perimeter of Triangle "+ Peritri);

	 }

}
