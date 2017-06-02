package textfiles;

import java.io.IOException;

public class FileData
{
	public static void main(String[ ] args) throws IOException
	{
		String file_name = "test.txt";
		//String fetches file name
		
		try
		{
			ReadFile file = new ReadFile( file_name );
			String[ ] aryLines = file.OpenFile( );
			//Creates instance of ReadFile class
			int i;
			for (i=0; i < aryLines.length; i++)
			{
				System.out.println (aryLines[i] );
				//Prints out
			}
		}
		catch (IOException e)
		//Catches Java exception to prevent fail
		{
			System.out.println ( e.getMessage () );
			//Prints out failure message if the program fails to read the file or if there is no file 
			//present
		}
	}
}