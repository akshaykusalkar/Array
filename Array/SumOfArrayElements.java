package Com.ptpl;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum Of Array Elements
		
		int i, j, sum = 0;
        int a[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum : "+sum);

	}

}
