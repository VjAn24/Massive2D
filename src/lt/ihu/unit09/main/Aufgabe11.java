package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe11 {

	public static void main(String[] args) {
		int m=5, n=7;
		int[][] mas=new int[m][n];
		Random rand= new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(100);
			}
		}
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0; i<mas.length;i++) {
			for (int j=0; j<mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
			i++;
			if (i>=mas.length) {
				break;
			}
			
			for (int j=mas[i].length-1;j>=0;j--) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();


	}

}
