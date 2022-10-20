package lt.ihu.unit09.main;

import java.util.Random;

public class Aufgabe04 {

	public static void main(String[] args) {
		int[][] mas= new int[4][6];
		Random rand=new Random();
		
		for (int i=0; i<mas.length; i++) {
			for (int j=0;j<mas[i].length; j++) {
				mas[i][j]=rand.nextInt(100);
			}
		}
		for (int element: mas[0]) {
			System.out.printf("[%4d]", element);
		}
		System.out.println();
		for (int element:mas[mas.length-1]) {
			System.out.printf("[%4d]", element);
		}

	}

}
