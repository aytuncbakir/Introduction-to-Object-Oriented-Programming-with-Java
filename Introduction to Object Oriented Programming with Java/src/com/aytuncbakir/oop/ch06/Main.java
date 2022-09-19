package com.aytuncbakir.oop.ch06;

public class Main {
	
	//public static void main(String... args)
	//public static void main(String args[])
	//public static void main(String[] abcs)
	public static void main(String[] args) { // cannot be changed. replacement is not possible. :)
		
		if (args.length == 4) {
			String name = args[0];
			String id = args[1];
			String gender = args[2];
			String course = args[3];
			System.out.println(name + " " + id + " " + gender+ " " + course);
		} else {
			System.out.println("Please insert four arguments!");
			System.exit(1);
		}

		int length = args.length;
		System.out.println("There are "+length + " arguments.");

		int i= 0;
		for (String s : args) {
			System.out.println("args["+i+"] :"+s);
			i++;
		}	
		int idNo = Integer.parseInt(args[3]);
		System.out.println(idNo);
	}

}
