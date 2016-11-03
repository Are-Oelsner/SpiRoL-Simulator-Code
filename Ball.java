/** My Ball Class */
class Ball {
	double mass;
        double radius;
	double xLocation;
	double yLocation;
	double xVelocity;
	double yVelocity;
	double xDrag;
	double yDrag;
	double fGravity;
	double fWind;

	public Ball(double x, double y, double vx, double vy) {
		xLocation = x;
		yLocation = y;
		xVelocity = vx;
		yVelocity = vy;
	}

	public void setBallState(double Mass, double x, double y, double vx, double vy) {
		mass = Mass;
		xLocation = x;
		yLocation = y;
		xVelocity = vx;
		yVelocity = vy;
	}

	public void calcDrag(double d) {
		if (d < 0 || d > 1) {
			System.out.print("Drag must be between 0 and 1");
		}
		else {
			xDrag = -d * xVelocity;
			yDrag = -d * yVelocity;
		}
	}

	public void drawBall() {
		StdDraw.filledCircle(xLocation, yLocation, 2);
	}
}

