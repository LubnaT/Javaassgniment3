package com.training;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 50;
		
		if(marks<50)
		{
			System.out.println("fail");
			
		}
		else if(marks>=50 && marks<70) {
			System.out.println("c grade");
			
		}
		else if(marks>=70 && marks<90) {
			System.out.println("B grade");
		}

		else if (marks>=90 && marks<100) {
			System.out.println("A grade");
		}
		else {
			System.out.println("invalid!");
		}
	}

}
