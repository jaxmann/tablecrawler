package p1;

import java.util.ArrayList;

public class BruteForce {
	
	public static void main(String[] args) {
		
		
	}
	
	public ArrayList<Player> generateData(int size) {
		int counter = 0;
		while (counter < size) {
			int val;
			Position randPos = Position.values()[(int)(Math.random()*Position.values().length)];
			switch(randPos) {
			case randPos.toString() == "QB": 
				val = 7000 + (int)(Math.random() * 9300);
			case "RB":
			case "WR":
			case "TE":
			case "D":
			case "K":
			}
			counter++;
		}
		
		return null;
	}

}
