package com.nt.four;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine []medicine=new Medicine[5];
		
		Random random=new Random();
		int index=random.nextInt(4);
		
		 medicine[0]=new Tablet();
		 medicine[1]=new Syrup();
		 medicine[2]=new Ointment();
		
		medicine[index].displayLabel();

	}

}
