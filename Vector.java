//Name: Are Oelsner
//My attempt at creating a vector object class

public class Vector {
	public double X;
	public double Y;
	public double V;
	public double theta = 0.0;

	public Vector() {
		X = 0;
		Y = 0;
		V = 0;
	}

	public Vector(double _X, double _Y) {
		X = _X;
		Y = _Y;
		V = Math.sqrt((X * X) + (Y * Y));
		theta = Math.toDegrees(Math.atan(Y/X));
	}

	public Vector(Vector v) {
		X = v.X;
		Y = v.Y;
	}

	public void X(double _X) {X = _X;}
	public void Y(double _Y) {Y = _Y;}

	public double getMagnitude(Vector v) {
		V = Math.sqrt((X * X) + (Y * Y));
		return V;
	}

	public void add(Vector v) {
		X += v.X;
		Y += v.Y;
	}

	public double getTheta(Vector v) {
		theta = Math.toDegrees(Math.atan(Y/X));
		return v.theta;
	}

	public void collision(Vector v, Vector n) {
		v.X = getMagnitude(n) * (v.dot(n));
		v.Y = v.V - v.X;
	}

	public double dot(Vector v) {
		return X * v.X + Y * v.Y;
	}

	public Vector getNormal(Line l) {
		Vector n = new Vector();
		n.X = l.x2 - l.x1;
		n.Y = l.y2 - l.y1;
		n.V = 1/l.slope;
		n.theta = getTheta(n);
		return n;
	}

	public Vector scalarMultiply(double d) {
		return new Vector(X * d, Y * d);
	}

	public static void main(String[] args) {
		Vector v = new Vector(3, 4); 
		System.out.print(v.X + " " + v.Y + " " + v.V + " " + v.theta);
	}
}


