import java.io.*;

public class Main{
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;

		try{
			in = new FileInputStream("Data.txt");
			out = new FileOutputStream("Data_Out.txt");

			int c;
			while ((c = in.read()) != -1){
				out.write(c);
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(in != null){
					in.close();
				}
				if(out != null){
					out.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}