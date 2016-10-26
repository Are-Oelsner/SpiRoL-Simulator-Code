//Name: Are Oelsner
/** Runs Program */
public class BallSimulator {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.print("Program requires three inputs <mass> <timestep> <gravity>");
		}

		double mass, x, y, x2, y2, vx, vy, vx2, vy2, ax, ay, t;
		mass = Double.parseDouble(args[0]);
		x = 0.0;
		y = 0.0;
		vx = 0.0;
		vy = 0.0;
		ax = 0.0;
		ay = Double.parseDouble(args[3]);


		Ball ball = new Ball(x, y, vx, vy);
	}
}

