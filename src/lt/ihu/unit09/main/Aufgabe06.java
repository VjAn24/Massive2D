package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe06 {

	public static void main(String[] args) {
		int[][] mas=new int[5][6];
		Random rand= new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j=1; j<mas[i].length;j+=2) {
				mas[i][j]=rand.nextInt(100);  
			}
		}
		for (int i=0; i<mas.length; i++) {
			for (int j=0;j<mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();		
		}
		System.out.println("Ungerade Zeile");
		for (int i=0;i<mas.length;i++) {
			for (int j=0; j<mas[i].length; j++) {
				if (mas[0][j]>mas[mas.length-1][j]) {
					System.out.printf("[%4d]", mas[i][j]);
				}else {
					System.out.printf("      ");
				}
			}
			System.out.println();
			
		}

	}

}
