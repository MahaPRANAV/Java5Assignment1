package AssignmentFive;
public class Circle extends Figure {

	double radius ;
	double AreaCir;
	double pericir;
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	 void findArea()
	 {
		 AreaCir = Math.PI * radius * radius ;
		 System.out.println("Area of Circle "+ AreaCir);
	 }
	 
	 void findPerimeter()
	 {
		 pericir = 2* Math.PI * radius ;
		 System.out.println("Perimeter of Circle "+ AreaCir);

	 }
}
