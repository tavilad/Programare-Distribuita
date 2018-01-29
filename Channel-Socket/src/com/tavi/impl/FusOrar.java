package com.tavi.impl;

public class FusOrar {

	public static int timezoneDifference(double longitA, double longitB) {

		return Math.abs(convertDegreesToHour(longitA) - convertDegreesToHour(longitB));
	}

	public static int getHourOfTimezone(double longitA, double longitB) {

		return Math.abs(convertDegreesToHour(longitA) + convertDegreesToHour(longitB));
	}

	private static int convertDegreesToHour(double degrees) {

		return (int) (degrees / 15);

	}
}
