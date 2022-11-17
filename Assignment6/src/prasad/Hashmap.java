package prasad;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> number = new HashMap<Integer,Integer>();
		number.put(1, 1);
		number.put(2, 4);
		number.put(3, 9);
		number.put(4, 16);
		number.put(5, 25);
		number.put(6, 36);
		number.put(7, 49);
		number.put(8, 64);
		number.put(9, 81);
		number.put(10, 100);
		number.put(11, 121);
		number.put(12, 144);
		number.put(13, 169);
		number.put(14, 196);
		number.put(15, 225);
		for (Map.Entry<Integer,Integer> entry :number.entrySet()) 
		{
			System.out.println(" key " + entry.getKey( )+ " Value "+entry.getValue( ));
		}

	}

}