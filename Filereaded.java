package pack3;

import java.io.FileReader;
import java.io.FileWriter;

public class Filereaded {

	public static void main(String[] args) {
		try{
	// TODO Auto-generated method stub
		
		FileReader f=new FileReader("C:\\Users\\lenovo\\Desktop\\spring\\collections\\src\\pack3\\a.txt");
		FileWriter w=new FileWriter("C:\\Users\\lenovo\\Desktop\\spring\\collections\\src\\pack3\\b.txt");
		
		int c;
		while((c=f.read())!=-1)
		{
			w.write(c);
		}
		w.flush();//to write
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
