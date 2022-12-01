package prasad;
import java.util.Scanner;
import java.util.*;
public class Plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter The Row = ");
         int n=sc.nextInt();
          int sum=0;
         int a[]=new int[n];
         System.out.println("Enter The Row Value = ");
         for(int i=0;i<n;i++)
         {
           a[i]=sc.nextInt();
         
       	sum+=a[i];
       	
        String result=(n>0)?"Positive":"Negative";
                System.out.println(result);
         }
         System.out.println("The numbers is : " + Arrays.toString(a));
         System.out.println(sum);
        
         for(int i=0;i<n;i++)
         {
         if(a[i]<0)
    	 {
           	System.out.println("Invalid Input");
          }
}
}
}