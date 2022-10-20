package lt.ihu.unit09.main;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe27 {

	public static void main(String[] args) {
		int n = 10;
		int[][] mas = new int[n][n];
		int kol1,kol2;
		kol1=inputFromConsole("Введите первый столбец от 1 до 10");
		kol2=inputFromConsole("Введите второй столбец от 1 до 10");
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(-100, 100);
			}
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
				
		int mas1 = 0,mas2 = 0;
		for (int i = 0; i < mas.length; i++) {
			mas1=mas[i][kol1-1];
			mas2=mas[i][kol2-1];
			mas[i][kol1-1]=mas2;
			mas[i][kol2-1]=mas1;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
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
