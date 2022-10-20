package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe10 {

	public static void main(String[] args) {
		int k=3, p=4;
		int[][] mas= new int[5][5];
		Random rand= new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0; j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(100);  
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == k || j==p) {
					System.out.printf("[%4d]", mas[i][j]);
				}
				else {
					System.out.printf("      ");
				}
			}
			System.out.println();
		}

	}

}
