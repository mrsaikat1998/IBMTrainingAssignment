package com.ibm;

public class PositionValue {
	public String removeAInFirst2Position(String str) {
		if (str.length() <= 2) {
			return str.replace("A", "");
		}
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Char = str.substring(2);
		return first2Chars.replaceAll("A", stringMinusFirst2Char);
	}
}
