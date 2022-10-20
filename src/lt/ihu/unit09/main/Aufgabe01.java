package lt.ihu.unit09.main;

public class Aufgabe01 {

	public static void main(String[] args) {
		int[][] mas= new int[3][4];
		int a=1;
		
		for (int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				if (j<1) {
					mas[i][j]=a;
				}
			}
		}
		for (int i=0;i<mas.length; i++) {
			for (int j=0; j<mas[i].length;j++){
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
