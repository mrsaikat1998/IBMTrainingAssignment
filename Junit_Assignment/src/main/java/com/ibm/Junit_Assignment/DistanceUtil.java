package com.ibm.Junit_Assignment;

public class DistanceUtil {

	public float kmsToMiles(float kms) {
		final float miles = 0.621371f;
		return kms * miles;
	}

	public float milesToKms(float miles) {
		final float kms = 1.60934f;
		return miles * kms;
	}
}
