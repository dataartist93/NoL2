package com.nol2.model;

public class ValidCheck {
	public boolean iskorean(String str) {
	      return str.matches("^[가-힣ㄱ-ㅎㅏ-ㅣ]*$");
	 }
	
	public boolean juminlang(int jumin1, int jumin2) {
		String j1 = jumin1+"";
		String j2 = jumin2+"";
		
		if(j1.length() != 6) {
			return false;
		}
		
		else if(j2.length() != 7) {
			return false;
		}
		
		else {
			return true;
		}
		
	}
}
