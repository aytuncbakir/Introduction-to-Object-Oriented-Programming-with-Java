package com.aytuncbakir.oop.ch05.lecture2;

public class SelectionWithSwitch {

	public static void main(String[] args) {

		
		switchVersion1(7);
		switchVersion2(3);
		switchVersion3("May");
		switchVersion4(11);
		switchVersion5(1);
		
		switchVersion6(9);
		
		

	}
	
	

	private static void switchVersion1(int i) {
		String month = "";
		switch (i) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "Fabruary";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
		
		System.out.println("Month:" +i+" "+month);

	}

	private static void switchVersion2(int i) {

		String monthOfYear= switch (i) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10-> "October";
		case 11-> "November";
		case 12-> "December";

		default -> "Value is not valid!";
		};

		System.out.println("Month of year is "+monthOfYear);

	}

	private static void switchVersion3(String monthName) {
		int orderOfMonth= switch (monthName) {
		case "January" -> 1;
		case "February"  -> 2;
		case "March" -> 3;
		case "April" -> 4;
		case "May" -> 5;
		case "June" -> 6;
		case "July" -> 7;
		case "August" -> 8;
		case "September" -> 9;
		case "October" ->10;
		case "November" -> 11;
		case "December" -> 12;

		default -> -1;
		};

		System.out.println("Month of year is "+orderOfMonth);
	}

	// After Java 14
	private static void switchVersion4(int month) {
		System.out.println(month +". Month: has "+ switch (month) {
			case 5-> 3; // may
			case 6 , 7 -> 4; // june, july
			case 3 , 4 -> 5; // march, april
			case 8 -> 6; // august
			case 1, 10 -> 7; // january, october
			case 2, 11, 12 -> 8; // february, november, december
			case 9 -> 9; // september
			default -> -1;
		} + " letters");

	}

	// After Java 14
	private static void switchVersion5(int month) {
		System.out.print("Month has : ");
		System.out.println(switch (month) {
			case 5:
				yield 3;
			case 6,7:
				yield 4;
			case 3, 4:
				yield 5;
			case 8:
				yield 6;
			case 1, 10:
				yield 7;
			case 2, 11, 12:
				yield 8;
			case 9:
				yield 9;
			default:
				yield -1;
		} + " letters");

	}
	
	private static void switchVersion6(int i) {
		int letters;
		switch (i) {
			case 5:
				letters = 3;
				break;
			case 6:
			case 7:
				letters = 4;
				break;
			case 3:
			case 4:
				letters = 5;
				break;
			case 8:
				letters = 6;
				break;
			case 1:
			case 10:
				letters = 7;
				break;
			case 2, 11, 12:
				letters = 8;
				break;
			case 9:
				letters = 9;
				break;
		
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
		}
		System.out.println("Month has "+ letters + " letters");
	
		
	}

}
