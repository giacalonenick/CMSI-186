/**
 *  File name     :  CalendarStuff.java
 *  Purpose       :  Provides a class with supporting methods for CountTheDays.java program
 *  Author        :  B.J. Johnson (prototype)
 *  Date          :  2017-01-02 (prototype)
 *  Author        :  Nick Giacalone
 *  Date          :  2017-01-19
 *  Description   :  This file provides the supporting methods for the CountTheDays program which will
 *                   calculate the number of days between two dates.  It shows the use of modularization
 *                   when writing Java code, and how the Java compiler can "figure things out" on its
 *                   own at "compile time".  It also provides examples of proper documentation, and uses
 *                   the source file header template as specified in the "Greeter.java" template program
 *                   file for use in CMSI 186, Spring 2018.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-02  B.J. Johnson  Initial writing and release
 *  @version 2.0.0  2018-01-24  Nick Giacalone
 */
 public class CountTheDays{
 	public static void main(String[] args){
 		if (args.length != 6){
 			System.out.println("There are not enough arguments.");
 		}else{
 		    long month1 = Long.parseLong(args[0]);
 		    long day1 = Long.parseLong(args[1]);
 		    long year1 = Long.parseLong(args[2]);
 		    long month2 = Long.parseLong(args[3]);
 		    long day2 = Long.parseLong(args[4]);
 		    long year2 = Long.parseLong(args[5]);
 			if (CalendarStuff.isValidDate(month1,day1,year1)==true){
 			    if (CalendarStuff.isValidDate(month2,day2,year2)==true){
 				    long dayCount = CalendarStuff.daysBetween(month1,day1,year1,month2,day2,year2);
 					System.out.println("The number of days between your dates is: " + dayCount);
 			    }else{
 					System.out.println("Your second date is not valid.");
 				}
 		    }else{
 				System.out.println("Your first date is not valid.");
 			}
 		}
 	}
 }
