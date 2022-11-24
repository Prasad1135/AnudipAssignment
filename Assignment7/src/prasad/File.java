package prasad;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj1=new File("C:\\New folder\\Demo file.txt");
		Scanner sc = new Scanner(obj1);
		int counter = 0;
		while(sc.hasNextLine()) 
		{
			// count words
					String str1 = sc.nextLine();
					String[]arr = str1.split(" ");
					// 
					/*if(str1.length()>5) 
					{
						
						System.out.println(" ");
					}*/
					counter +=arr.length;
		}
				System.out.println("count words:");
				System.out.println(counter);
		FileInputStream obj = new FileInputStream("C:\\New folder\\Demo file.txt");
		
		int i;
		String str = "";
		
		while((i=obj.read())!=-1)   // read data from text file
		{
			System.out.print((char)i);
		}
		
		obj.close();	
	}

}
