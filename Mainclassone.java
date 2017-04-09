package AssignmentFive;

public class Mainclassone {

	public static void main(String[] args) {

		Circle c = new Circle (4);
		c.findArea();
		c.findPerimeter();

		Rectangle r = new Rectangle (2,4);
		r.findArea();
		r.findPerimeter();
		
		Triangle t = new Triangle (2,4,6);
		t.findArea();
		t.findPerimeter();
	}

}
