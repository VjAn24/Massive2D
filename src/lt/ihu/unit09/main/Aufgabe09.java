package lt.ihu.unit09.main;

public class Aufgabe09 {

	public static void main(String[] args) {
		
		int[][] mas= new int[5][5];
		 for (int i=0;i<mas.length;i++) {
			 mas[i][i]=i;
		 }
		 
		 for (int i=0;i<mas.length;i++) {
			 for (int j=0;j<mas[i].length;j++) {
				 if (mas[i]==mas[j]) {
					 System.out.printf("[%4d]", mas[i][j]);
				 }else {
					 System.out.printf("     ");
				 }
			 }
			 System.out.println();
		 }
	}

}
