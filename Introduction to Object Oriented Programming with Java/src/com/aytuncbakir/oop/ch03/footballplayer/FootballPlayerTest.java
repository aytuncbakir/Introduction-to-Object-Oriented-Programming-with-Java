package com.aytuncbakir.oop.ch03.footballplayer;

public class FootballPlayerTest {

	public static void main(String args[]) {
		
		FootballPlayer alex = new FootballPlayer();
		alex.no = 10;
		alex.name = "Alex de Souza";
		alex.minutes = 0;
		alex.inPlay = true;
		alex.numberOfGoals = 0;
		
		alex.play(90);
		alex.score();
		alex.score();
		
		System.out.println("alex numberOfGoals :"+alex.numberOfGoals);
		System.out.println("alex played "+ alex.minutes+ " minutes");
		
		alex.play(60);
		alex.score();
		
		System.out.println("alex numberOfGoals :"+alex.numberOfGoals);
		System.out.println("alex played "+ alex.minutes+ " minutes");
		
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println();
		
		FootballPlayer oguzhan = new FootballPlayer();
		oguzhan.no = 10;
		oguzhan.name = "Oguzhan";
		oguzhan.minutes = 0;
		oguzhan.inPlay = true;
		oguzhan.numberOfGoals = 0;
		
		oguzhan.play(90);
		oguzhan.score();
		oguzhan.score();
		
		System.out.println("Oguzhan numberOfGoals :"+oguzhan.numberOfGoals);
		System.out.println("Oguzhan played "+ oguzhan.minutes+ " minutes");
		
	}
}
