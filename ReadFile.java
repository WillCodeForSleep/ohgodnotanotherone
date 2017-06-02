package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile
{
	private String path;
	
	public ReadFile (String file_path)
	{
		path= file_path;
	}
	
	public String[] OpenFile() throws IOException
	{
		//Creates new instance of File Reader
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = readLines( );
		String[] textData = new String[numberOfLines];
		
		int i;
		
		for (i=0; i < numberOfLines; i++)
			//counts lines
		{
			textData[i] = textReader.readLine();
		}
		textReader.close();
		return textData;
	}
	int readLines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		//Creates bf BufferedReader instance within class
		BufferedReader bf = new BufferedReader(file_to_read);
		
		
		String aLine;
		//Removes limit on number of lines that can be read in
		int numberOfLines = 0;
		
		
		while ( ( aLine = bf.readLine( ) ) != null )
		{
			numberOfLines++;
		}
		//Closes instance bf
		bf.close();
		
		return numberOfLines;
	}
}