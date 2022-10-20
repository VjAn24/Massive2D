package lt.ihu.unit09.main;

public class Aufgabe17 {

	public static void main(String[] args) {
		int n=8, a=1;
		int[][] mas=new int[n][n];
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				if (i*j==0) {
					mas[i][j]=a;
				}
				mas[i][mas[i].length-1]=a;
				mas[mas[i].length-1][j]=a;
			}
		}
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
