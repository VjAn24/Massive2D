package lt.ihu.unit09.main;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe26 {

	public static void main(String[] args) {
		
		int n,m, max,min,summ;
		n=inputFromConsole("Введите первое значение");
		m=inputFromConsole("Введите второе значение");
		int[][] mas= new int[n][m];
		Random rand=new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(-100,100);
			}
		}
		System.out.println();
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		summ=0;
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				if (mas[i][j]<0) {
					summ=summ+mas[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов в строке"+(i+1)+"="+summ);
			summ=0;
		}
		int a = 0,b=0;
		min=100;
		max=-100;
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				if (max<mas[i][j]) {
					max=mas[i][j];
					a=j;
				}if(min>mas[i][j]) {
					min=mas[i][j];
					b=j;
				}
				mas[i][a]=min;
				mas[i][b]=max;
				}
			max=-100;
			min=100;
		}
		max=-100;
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				if (max<mas[i][j]) {
					max=mas[i][j];
				}
				}
			System.out.println("Max"+(i+1)+"="+max);
			max=-100;
		}
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}
	public static int inputFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод" + message);
		}
		value = sc.nextInt();
		return value;
	}

}
