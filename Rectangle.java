package AssignmentFive;

public class Rectangle extends Figure {
	
	double length;
	double breadth;
	double Arearec;
	double perirec;
	
	public Rectangle (double length ,double breadth)
	{
	  this.length = length;
	  this.breadth = breadth;
	}

	void findArea()
	 {
		 Arearec = length * breadth ;
		 System.out.println("Area of Rectangle "+ Arearec);
	 }
	
	void findPerimeter()
	 {
		 perirec = 2 * (length + breadth) ;
		 System.out.println("Perimeter of Rectangle "+ perirec);

	 }
}
