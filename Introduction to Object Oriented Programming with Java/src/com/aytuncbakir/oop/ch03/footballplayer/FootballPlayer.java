package com.aytuncbakir.oop.ch03.footballplayer;

public class FootballPlayer {
	
	int no;
	String name;
	int minutes;
	boolean inPlay;
	int numberOfGoals;
	
	void play(int minutestoPlay) {
		minutes = minutes + minutestoPlay;
	}
	
	void score() {
		numberOfGoals++;
	}
	
}
