package com.assignment.three;

public class TravelCardTest {

	public static void main(String[] args) {
		TravelCard tc=new TravelCard();
		tc.setAvailableBalance(100000);
		tc.setSwipeLimit(3);
		tc.setCardNo(3319427);
		
		tc.swipeCard(20);
	}

}
