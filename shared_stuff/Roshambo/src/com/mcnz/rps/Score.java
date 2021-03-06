package com.mcnz.rps;

public class Score {
	
	private int wins;
	private int losses;
	private int ties;
	
	public void increaseWins() {
		wins++;
	}
	
	public void increaseLosses() {
		losses = losses + 1;
	}
	
	public void increaseTies() {
		ties++;
	}
	
	public String toString() {
		String output = "Wins :: " + wins;
		output = output + " -- Ties :: " + ties;
		output = output + " -- Losses :: " + losses;
		return output;
	}
	
	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTies() {
		return ties;
	}

}
