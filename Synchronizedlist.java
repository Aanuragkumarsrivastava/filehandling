package pack3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Synchronizedlist {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i=i+2)
		{
			l.add(i);
		}
		System.out.println(l);
		
		List<Integer> syn=Collections.synchronizedList(l);
		
		 Collections.reverseOrder();
		
		 System.out.println("Synchronized lit\n"+syn);
	}

}
