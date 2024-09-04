package admin.jp.project;

public class DayTwo {
	 
	    public static void main(String[] args) {
	        int number = 20;

	        // 1. if statement
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        }

	        // 2. if-else statement
	        if (number % 2 == 0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }

	        // 3. if-else if-else statement
	        if (number < 0) {
	            System.out.println("The number is negative.");
	        } else if (number == 0) {
	            System.out.println("The number is zero.");
	        } else {
	            System.out.println("The number is positive.");
	        }

	        // 4. Nested if statement
	        if (number > 0) {
	            if (number % 2 == 0) {
	                System.out.println("The number is positive and even.");
	            } else {
	                System.out.println("The number is positive and odd.");
	            }
	        }

	        // 5. switch statement
	        int day = 3;
	        String dayName;
	        switch (day) {
	            case 1:
	                dayName = "Monday";
	                break;
	            case 2:
	                dayName = "Tuesday";
	                break;
	            case 3:
	                dayName = "Wednesday";
	                break;
	            case 4:
	                dayName = "Thursday";
	                break;
	            case 5:
	                dayName = "Friday";
	                break;
	            case 6:
	                dayName = "Saturday";
	                break;
	            case 7:
	                dayName = "Sunday";
	                break;
	            default:
	                dayName = "Invalid day";
	                break;
	        }
	        System.out.println("Today is " + dayName + ".");
	    }
	

}
