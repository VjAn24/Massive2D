package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe07 {

	public static void main(String[] args) {
		int[][] mas= new int[5][5];
		Random rand = new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0; j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(-100,100); 
			}
		}
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int sum =0;
		for (int i=0; i<mas.length;i++) {
			for (int j=0; j<mas[i].length; j++) {
				if (Math.abs(mas[i][j])%2==1 && mas[i][j]<0) {
					sum +=mas[i][j];
				}
			}
		}
		System.out.println("summa="+sum);

	}

}
