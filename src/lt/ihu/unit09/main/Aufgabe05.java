package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe05 {

	public static void main(String[] args) {
		int[][] mas= new int[5][6];
		Random rand=new Random();
		
		for (int i=0; i<mas.length; i++) {
			for (int j=0; j<mas[i].length; j++) {
				mas[i][j]=rand.nextInt(100);
			}
		}
		for (int i=0; i<mas.length; i++) {
			for (int j=0;j<mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();		
		}
		System.out.println("Gerade Zeile");
		for (int i=0;i<mas.length;i+=2) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();	
		}
		

	}

}
