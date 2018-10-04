package com.ravikrishna.adepu.math;

public class FactorialTrialingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		   int cnt = 0;
	        while(n>0){
	            cnt += n/5;
	            n/=5;
	        }
	      System.out.println(cnt);
	}

}
