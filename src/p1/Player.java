package p1;

public class Player {

	private Position position;
	private int price;
	private double[] weeklyPoints = new double[16];
	private double[] weeklyProjPoints = new double[16];

	Player(Position position, int price, double[] weeklyPoints, double[] weeklyProjPoints) {
		this.position = position;
		this.price = price;
		this.weeklyPoints = weeklyPoints;
		this.weeklyProjPoints = weeklyProjPoints;
		
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double[] getWeeklyPoints() {
		return weeklyPoints;
	}

	public void setWeeklyPoints(double[] weeklyPoints) {
		this.weeklyPoints = weeklyPoints;
	}

	public double[] getWeeklyProjPoints() {
		return weeklyProjPoints;
	}

	public void setWeeklyProjPoints(double[] weeklyProjPoints) {
		this.weeklyProjPoints = weeklyProjPoints;
	}

	
	
	
}