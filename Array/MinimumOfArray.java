package Com.ptpl;

public class MinimumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,min;
        int a[]={10,60,5,40,50};
        min=a[0];
        for(i=0;i<5;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum : "+min);

	}

}
