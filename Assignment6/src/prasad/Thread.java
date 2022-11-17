package prasad;

public class Thread {		 
		public void run()
		{
			int n=50;
			int sum=0;
			
			for(int i=1;i<=50;i++)  
			{
				sum+=i;
			}
			
			int average=sum/n;     
			
			System.out.println("Average of 50 numbers:"+average);  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread obj=new Thread(); 
		         
		int[] array1= {10,15,20,25,30};
		int square=0;
		for(int i=0;i<array1.length;i++)  
		{
			square=(int)Math.pow(array1[i], 2);    
			
			System.out.println(array1[i]+" "+square);
		}
	}

}