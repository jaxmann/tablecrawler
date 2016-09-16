package p1;

import java.util.ArrayList;

public class BruteForce {
	
	public static int BUDGET = 60000;
	public static int CURRENT_WEEK = 2;
	
	public static void main(String[] args) {
		ArrayList<Player> toprint = generateData(10);
		for (Player play : toprint) {
			System.out.println("position is " +play.getPosition() + " price is " +play.getPrice() + " week 1 pts is "+play.getWeeklyPoints()[0]+" week 1 proj pts is "+play.getWeeklyProjPoints()[0]);
		}
	}
	
	public static ArrayList<Player> generateData(int size) {
		ArrayList<Player> ret = new ArrayList<Player>();
		int counter = 0;
		while (counter < size) {
			int val = 0;
			double[] weeklyData = new double[16];
			double[] weeklyProjPoints = new double[16];
			Position randPos = Position.values()[(int)(Math.random()*Position.values().length)];
			switch(randPos.toString()) {
			case "QB":
				val = 100*(75 + (int)(Math.random() * 93));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(10 + (int)(Math.random() * 20));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(10 + (int)(Math.random() * 20));
				}
			case "RB":
				val = 100*(70 + (int)(Math.random() * 93));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(8 + (int)(Math.random() * 18));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(8 + (int)(Math.random() * 18));
				}			
			case "WR":
				val = 100*(70 + (int)(Math.random() * 93));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(7 + (int)(Math.random() * 20));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(8 + (int)(Math.random() * 18));
				}			
			case "TE":
				val = 100*(50 + (int)(Math.random() * 85));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(5 + (int)(Math.random() * 15));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(8 + (int)(Math.random() * 18));
				}			
			case "D":
				val = 100*(45 + (int)(Math.random() * 55));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(3 + (int)(Math.random() * 13));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(8 + (int)(Math.random() * 18));
				}			
			case "K":
				val = 100*(45 + (int)(Math.random() * 45));
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyData[i] = 1*(3 + (int)(Math.random() * 13));
				}
				for (int i=0; i<CURRENT_WEEK; i++) {
					weeklyProjPoints[i] = 1*(8 + (int)(Math.random() * 18));
				}			}
			counter++;
			ret.add(new Player(randPos, val, weeklyData, weeklyProjPoints));
		}
		return ret;
	}

}
