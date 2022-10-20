package lt.ihu.unit09.main;

public class Aufgabe18 {

	public static void main(String[] args) {
		int n=6;
		int[][] mas=new int[n][n];
		
		for (int i=0;i<mas.length;i++) {
			for (int j=0;j<mas[i].length;j++) {
				
				if (j<mas[i].length-i) {
					mas[i][j]=i+1;
				}
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
