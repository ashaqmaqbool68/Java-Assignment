//program demonstrate use of files 
import java.io.*;
import java.util.*;
public class Files{
	public static void main(String[] args) {
		String data = "Hello Program for files";
		File file = new File("./abc.txt"); // creating file object
		try{
			
			FileOutputStream fos = new FileOutputStream(file); //creating FileOutputStream object
			if(!file.exists()){            // verifying existances of file
		  		file.createNewFile();
		  	}

		  byte[] bs = data.getBytes(); // getting bytes from String object
		  fos.write(bs);    // writting to file
		  fos.flush();
		  fos.close();
		  System.out.println("File written");
		}
		catch(Exception e){}

		try{
			FileInputStream fis = new FileInputStream(file); // creating FileInputStream object
			int c;
			if(file.exists()){  // checking existance
				while((c = fis.read()) != -1){   // while file does not reaches end
					System.out.print((char)c);
				}
			}

			fis.close();
		}
		catch(Exception e){}

	}
}