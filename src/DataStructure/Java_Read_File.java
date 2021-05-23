package DataStructure;

import java.util.*;
import java.io.*;
public class Java_Read_File
{
	public static void main (String [] args) throws IOException
	{
		 Scanner keyboard = new Scanner (System.in);
		 System.out.print("Enter File Name");
		 String filename = keyboard.nextLine();
		 File f = new File (filename);
		 Scanner fin = new Scanner (f);
		 String stationcode = fin.nextLine();
		 String stationname = fin.nextLine();
		 String date = fin.nextLine ();


		 while (fin.hasNextLine ( ) )
		 {
		
		System.out.print (date);
		System.out.print(stationname);
		
		 }
		
		fin.close ();
	}
}