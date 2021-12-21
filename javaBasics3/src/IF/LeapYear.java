package IF;

import java.util.Scanner;

public class LeapYear {
	
	void Leap() {
		Scanner s = new Scanner(System.in);
		int year; 
		System.out.println("enter the year");
		
		year = s.nextInt();
		
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
			System.out.println("LEAP YEAR");  
		}  
		else{  
			System.out.println("COMMON YEAR");  
		}  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear obj = new LeapYear();
		obj.Leap();
		
	}

}
