package lukino;

public class Distance {
	
	public static double GetDistance(Point a){
		return Math.sqrt((a.x * a.x) + (a.y * a.y));
	}

}
