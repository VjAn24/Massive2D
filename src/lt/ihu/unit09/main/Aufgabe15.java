package lt.ihu.unit09.main;

public class Aufgabe15 {

	public static void main(String[] args) {
		int n=6;
		int[][] mas=new int[n][n];
		
		for (int i=0;i<mas.length;i++) {
			mas[i][i]=n;
			n--;
		}
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
