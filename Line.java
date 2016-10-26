//Name: Are Oelsner
//My attempt at creating a line object class

public class Line {
	public double x1 = 0.0;
	public double y1 = 0.0;
	public double x2 = 1.0;
	public double y2 = 1.0;
	public double slope = 1.0; 

	public Line() {
	}

	public Line(double _x1, double _y1, double _x2, double _y2) {
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		slope = (y2-y1)/(x2-x1);
	}

	public void drawLine(Line l) {

	}

	public Vector getNormal(Line l) {

}


