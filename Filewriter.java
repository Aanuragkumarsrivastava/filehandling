package pack3;

import java.io.File;
import java.io.FileWriter;

public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		@SuppressWarnings("resource")
		FileWriter w=new FileWriter("C:\\Users\\lenovo\\Desktop\\spring\\collections\\src\\pack3\\b.txt");
		
		for(int i=0;i<=100;i+=2)
		{
			w.write("i");//this will print i in the file location
			w.write(" ");
			w.flush();
		}
		//System.out.println("written succcesfully\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
