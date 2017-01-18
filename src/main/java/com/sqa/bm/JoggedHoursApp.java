/**
 * File Name: JoggedHoursApp.java<br>
 * Mark, Bernard<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 17, 2017
 */
package com.sqa.bm;

import java.util.*;

import com.sqa.bm.helpers.*;

/**
 * JoggedHoursApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mark, Bernard
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String appName = "JoggedHoursApp";
		String userName = AppBasics.greetUserAndGetName(appName);
		calcHoursJogged();
		AppBasics.farwellUser(userName, appName);
		// addEachToTotal();//
	}

	/**
	 *
	 */
	private static void calcHoursJogged() {
		// TODO Auto-generated method stub
		int totalJoggedHours = 0;
		double avgJoggedHours;
		int day1NumHours;
		int day2NumHours;
		int day3NumHours;
		int day4NumHours;
		int day5NumHours;
		int day6NumHours;
		int day7NumHours;
		Scanner scanner = new Scanner(System.in);
		// totalJoggedHours = day1NumHours + totalStartingJoggedHours;
		String hours = AppBasics.requestInfoFromUser("How many hours did you jog on Day 1");
		day1NumHours = Integer.parseInt(hours);
		// day1NumHours = Integer.parseInt(hours);//
		totalJoggedHours = day1NumHours + totalJoggedHours;
		String day2 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 2");
		day2NumHours = Integer.parseInt(day2);
		// day1NumHours = Integer.parseInt(scanner.nextLine());//
		totalJoggedHours = day2NumHours + totalJoggedHours;
		// System.out.println("Your total jogged hours after day 2 is " +
		// totalJoggedHours);//
		String day3 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 3");
		day3NumHours = Integer.parseInt(day3);
		// day1NumHours = Integer.parseInt(scanner.nextLine());//
		totalJoggedHours = day3NumHours + totalJoggedHours;
		String day4 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 4");
		day4NumHours = Integer.parseInt(day4);
		totalJoggedHours = day4NumHours + totalJoggedHours;
		String day5 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 5");
		day5NumHours = Integer.parseInt(day5);
		totalJoggedHours = day5NumHours + totalJoggedHours;
		String day6 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 6");
		day6NumHours = Integer.parseInt(day6);
		totalJoggedHours = day6NumHours + totalJoggedHours;
		String day7 = AppBasics.requestInfoFromUser("How many hours did you jog on Day 7");
		day7NumHours = Integer.parseInt(day7);
		totalJoggedHours = day7NumHours + totalJoggedHours;
		// System.out.println("Your total hours jogged is " + (day1NumHours +
		// day2NumHours + day3NumHours + day4NumHours + day5NumHours +
		// day6NumHours + day7NumHours));//
		System.out.println("Your total hours jogged is " + totalJoggedHours);
		avgJoggedHours = totalJoggedHours / 7;
		System.out.println("Your average hours jogged is " + avgJoggedHours);
		if (totalJoggedHours < 10) {
			System.out.println("You are an amateur jogger.");
		} else if (totalJoggedHours >= 10 && totalJoggedHours < 20) {
			System.out.println("You are a dedicated jogger.");
		} else if (totalJoggedHours >= 20 && totalJoggedHours < 40) {
			System.out.println("You are an advanced jogger!");
		} else if (totalJoggedHours >= 40) {
			System.out.println("You are a premium jogger!");
		}
	}
}
