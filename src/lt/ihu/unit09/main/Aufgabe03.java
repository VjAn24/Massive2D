package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe03 {

	public static void main(String[] args) {
		int[][] mas=new int[5][7];
		Random rand=new Random();
		for (int i=0; i<mas.length; i++) {
			for (int j=0; j<mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		System.out.println("Erste Kolonne");
		for (int i=0; i<mas.length; i++) {
			System.out.printf("[%4d]\n",mas[i][0]);
			
		}
		System.out.println("Zweite Kolonne");
		for (int i=0; i<mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][mas[i].length-1]);
		}

	}

}
