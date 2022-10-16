package Com.ptpl;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i,sum=0,avg=0;
	        int a[]={10,20,30};
	        for(i=0;i<a.length;i++)
	        {
	            sum+=a[i];
	        }
	        avg=sum/a.length;
	        System.out.println("Average : "+avg);

	}

}
