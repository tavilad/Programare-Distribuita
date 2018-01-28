package com.tavi.impl;

public class FusOrar {

	public static int timezoneDifference(double longitA, double longitB) {
		
		
		return Math.abs(convertDegreesToHour(longitA) - convertDegreesToHour(longitB));
	}

	public static void getHourOfTimezone(double longitA, double longitB) {

	}

	public static int convertDegreesToHour(double degrees) {
		
		if(degrees<=15)
			return 0;
		if(degrees>16 && degrees<=30)
			return 1;
		if(degrees>31 && degrees<=45)
			return 2;
		if(degrees>46 && degrees<=60)
			return 3;
		if(degrees>61 && degrees<=75)
			return 4;
		if(degrees>76 && degrees<=90)
			return 5;
		if(degrees>91 && degrees<=105)
			return 6;
		if(degrees>106 && degrees<=120)
			return 7;
		if(degrees>121 && degrees<=135)
			return 8;
		if(degrees>136 && degrees<=150)
			return 9;
		if(degrees>151 && degrees<=165)
			return 10;
		if(degrees>166 && degrees<=180)
			return 11;
		if(degrees>181 && degrees<=195)
			return 12;
		if(degrees>196 && degrees<=210)
			return 13;
		if(degrees>211 && degrees<=225)
			return 14;
		if(degrees>226 && degrees<=240)
			return 15;
		if(degrees>241 && degrees<=255)
			return 16;
		if(degrees>256 && degrees<=270)
			return 17;
		if(degrees>271 && degrees<=285)
			return 18;
		if(degrees>286 && degrees<=300)
			return 19;
		if(degrees>301 && degrees<=315)
			return 20;
		if(degrees>316 && degrees<=330)
			return 21;
		if(degrees>331 && degrees<345)
			return 22;
		if(degrees>346 && degrees<=360)
			return 23;
		
		
		return -1;
		

	}
}
