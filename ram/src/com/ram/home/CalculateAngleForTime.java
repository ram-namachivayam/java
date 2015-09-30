package com.ram.home;

public class CalculateAngleForTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// minute hand - 360 degree in 60 minutes - 360/60 = 6 degree per minute
		// hour hand - 360 degree in 12 hours - 360/12 = 
		int minuteHandDegreePerMinute = 360/60;
		int hourHandDegreePerMinute = (360/12)/60; 
		
		int hour = 3;
		int minute = 30;
		
		int hourAngle = hourHandDegreePerMinute * (hour * 60 + minute);
		int minAngle = minuteHandDegreePerMinute * minute;
		
		int angle = Math.abs(hourAngle - minAngle);
		
		angle = Math.min(360-angle, angle);
		
		System.out.println(angle);
	}
	
	

}
