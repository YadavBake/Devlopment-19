import java.io.*;
	class Test2 
	{
		public static void main(String args[])throws IOException
		{
			System.out.println("Console Output");
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.println("File output");
			pw.flush();
		}
	}