package Treesss;

import java.util.Scanner;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//int p=scan.nextInt();
		//int r=scan.nextInt();
		//int t=scan.nextInt();
		System.out.printf("%.2f",calculateSimpleIntrest(2000, 20, 2));
		

	}
	public static double calculateSimpleIntrest(int p,int r,int t) {
		double simpleintrestt=p*r*t/100;
		return (int) Math.round(simpleintrestt*100)/100;
	}

}
