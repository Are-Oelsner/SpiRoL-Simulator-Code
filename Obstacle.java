//Name: Are Oelsner
//My Obstacles Class

import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Obstacle {
	private Vector[] points;
	private Vector[] normals;
	private Vector[] edges;

	public Obstacle(Vector[] _points, Vector[] _normals, Vector[] _edges) {
		points = _points;
		normals = _normals;
		edges = _edges;
	}

	public void getNormals() {
	}

	public void shiftObstacle(double x, double y) {
		for (int i = 0; i < points.length; i++) {
			points[i].X += x;
			points[i].Y += y;
		}
	}

	public static Vector[] readPoints(Scanner s) {
		return points;
	}

	public Vector[] readNormals(Scanner s) {
		return normals;
	}

	public Vector[] readEdges(Scanner s) {
		return edges;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("Obstacles.sim"));
		int n = s.nextInt();
		Vector[] _points;
		Vector[] _normals;
		Vector[] _edges;
		while(s.hasNext()) {
			String Next = s.next();
			switch(Next) {
				case "points": _points = readPoints(s); break;
				case "normals": _normals = readNormals(s); break;
				case "edges": _edges = readEdges(s); break;
				default: break;
			}
		}
		Obstacle obstacle = new Obstacle(_points, _normals, _edges);
	}
}
