package advanced;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


class in_and_out_class{
	public static void main (String[] args){
	InputStream strm = null;
	try{
		strm=new FileInputStream("inout.java");
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	
	try{
		System.out.println(strm.available());
		
	}catch(IOException e){
		e.printStackTrace();
	}
	}

}
